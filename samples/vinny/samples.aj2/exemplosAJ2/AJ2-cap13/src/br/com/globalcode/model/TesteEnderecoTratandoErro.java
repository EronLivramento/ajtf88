package br.com.globalcode.model;

import br.com.globalcode.exceptions.NumeroInvalidoException;

public class TesteEnderecoTratandoErro {

    public static void main(String[] args) {
        try {
            Endereco e = new Endereco("Av. Jabaquara", 0);
        } catch (NumeroInvalidoException e) {
            e.printStackTrace();
        }
    }
}
