package br.com.globalcode.beans;

public class Pessoa implements Comparable {
	private String nome;
	private long rg;
	private String dataNascimento;

	public boolean equals(Object o) {
		// Se for um parametro nulo retornaremos false
		if (o == null)
			return false;
		// Se nao for um objeto da classe Pessoa retornaremos false
		if (!(this.getClass().equals(o.getClass())))
			return false;
		// Se for um objeto da classe Pessoa faremos o cast down
		Pessoa outra = (Pessoa) o;
		// Verifica se os rgs sao iguais
		boolean rgsIguais = this.getRg() == outra.getRg();
		// Verifica se os nomes sao iguais
		boolean nomesIguais = false;
		if (this.getNome() != null)
			nomesIguais = this.getNome().equals(outra.getNome());
		else
			nomesIguais = outra.getNome() == null;
		// retorna o resultado da comparacao
		return rgsIguais && nomesIguais;
	}

	public int compareTo(Object obj) {
		Pessoa outraPessoa = (Pessoa) obj;
		String atributos = nome + rg;
		String outrosAtributos = outraPessoa.getNome() + outraPessoa.getRg();
		return atributos.compareTo(outrosAtributos);
	}
	
	// demais métodos omitidos	

	public Pessoa(String nome, long rg, String dataNasc) {
		this.setNome(nome);
		this.setRg(rg);
		this.setDataNascimento(dataNasc);
	}
	
	public int hashCode() {
		String atributos = nome + rg;
		return atributos.hashCode();
	}
	
	public String toString() {
		String tmpPessoa = "Nome: " + nome;
		tmpPessoa += "\tRG: " + rg + "\n";
		tmpPessoa += "\tdata nascimento: " + dataNascimento;
		return tmpPessoa;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getNome() {
		return this.nome;
	}

	public long getRg() {
		return this.rg;
	}
	
	/* método hashCode do apendice de hashCode avancado
	public int hashCode() {
		int resultado = 13; // acumulador
		resultado = 37 * resultado + (int) (rg ^ rg >>> 32);
		resultado = 37 * resultado + (nome != null ? nome.hashCode() : 0);
		return resultado;
	} */
}
