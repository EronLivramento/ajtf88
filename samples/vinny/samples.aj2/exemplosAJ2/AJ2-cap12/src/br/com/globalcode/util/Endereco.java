package br.com.globalcode.util;

public class Endereco {
	private String rua;
    private int numero;
    // Os métodos da classe foram omitidos

    public Endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
	}
    
    public String toString() {
    	return this.rua + "," + this.numero;
    }
}
