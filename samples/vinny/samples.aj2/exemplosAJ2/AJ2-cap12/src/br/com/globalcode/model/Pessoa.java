package br.com.globalcode.model;

import br.com.globalcode.util.Endereco;

public class Pessoa {

    private Endereco endereco;
    private String nome;
    private String rg;
    // Os metodos da classe foram omitidos
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
