package br.com.globalcode.model;

import br.com.globalcode.exceptions.NumeroInvalidoException;

public class TesteEnderecoRelancandoErro {

    public static void main(String[] args) throws NumeroInvalidoException {
        Endereco e = new Endereco("Av. Jabaquara", 0);
    }
}
