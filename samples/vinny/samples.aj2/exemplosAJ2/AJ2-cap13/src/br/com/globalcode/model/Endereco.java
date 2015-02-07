package br.com.globalcode.model;

import br.com.globalcode.exceptions.NumeroInvalidoException;

public class Endereco {
    private String rua;
    private int numero;
    // Os métodos da classe foram omitidos
    //Como o construtor chama o método setNumero é necessário indicar na
    // assinatura que ele pode lançar uma exception NumeroInvalidoException
    public Endereco(String rua, int numero) throws NumeroInvalidoException {
        this.setRua(rua);
        this.setNumero(numero);
    }
    public void setNumero(int numero) throws NumeroInvalidoException {
        if (numero > 0) {
            this.numero = numero;
        } else {
            throw new NumeroInvalidoException(numero + " nao e valido! ");
        }
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return rua;
    }
    public int getNumero() {
        return numero;
    }
}
