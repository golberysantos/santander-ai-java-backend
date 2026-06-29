package br.com.padroes.service.impl;

import br.com.padroes.exception.ClienteNotFoundException;
import br.com.padroes.model.Cliente;
import br.com.padroes.model.Endereco;
import br.com.padroes.repository.ClienteRepository;
import br.com.padroes.repository.EnderecoRepository;
import br.com.padroes.service.ClienteService;
import br.com.padroes.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementação da Strategy ClienteService.
 *
 * Padrões aplicados:
 * - Singleton  → gerenciado pelo Spring como @Service
 * - Strategy   → implementa ClienteService, injetável via interface
 * - Facade     → abstrai integração com ViaCEP e JPA em métodos simples
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new ClienteNotFoundException(id));
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        clienteRepository.findById(id).ifPresent(clienteBd -> {
            cliente.setId(id);
            salvarClienteComCep(cliente);
        });
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep)
                .orElseGet(() -> {
                    Endereco novoEndereco = viaCepService.consultarCep(cep);
                    enderecoRepository.save(novoEndereco);
                    return novoEndereco;
                });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
