package br.com.padroes.exception;

public class ClienteNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ClienteNotFoundException(Long id) {
        super("Cliente não encontrado com id: " + id);
    }
}
