package br.com.padroes.service;

import br.com.padroes.model.Cliente;

/**
 * Interface que define o padrão Strategy no domínio de clientes.
 * Permite múltiplas implementações injetáveis pelo Spring.
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
