package br.com.globalcode.beans;

public class Cliente {
	private String nome = null;
	private int id;
	private int qtdPedidos;

	public Cliente(int id, String nome, int numPedidos) {
		this.id = id;
		this.setNome(nome);
		this.setQtdPedidos(numPedidos);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setQtdPedidos(int numPed) {
		this.qtdPedidos = numPed;
	}
	public String getNome() {
		return this.nome;
	}
	public int getId() {
		return this.id;
	}
	public int getQtdPedidos() {
		return this.qtdPedidos;
	}
	public String toString() {
		return "id: " + this.id + "\t" + "Nome: " + this.nome + "\t"
				+ "Pedidos: " + this.qtdPedidos;
	}
}
