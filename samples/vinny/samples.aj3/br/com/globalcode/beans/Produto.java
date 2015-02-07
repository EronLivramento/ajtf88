package br.com.globalcode.beans;

public class Produto {
	private int id;
	private String nome;
	private int preco;
	
	public Produto(){
		super();
	}
	public Produto (String nome, int preco){
		setNome(nome);
		setPreco(preco);
	}
	public Produto (int id, String nome, int preco){
		this(nome, preco);
		setId(id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome(){
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return this.preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String toString() {
		return "[Nome do Produto: " + nome + "][ ID: " + id 
				+ "][R$: " + preco + "]";
	}
}
