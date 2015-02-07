public class Pessoa {

	protected Endereco endereco;
	protected String nome;
	protected String rg;

	public Pessoa(Endereco e, String nome, String rg) {
        this.setEndereco(e);
        this.setNome(nome);
        this.setRg(rg);
    }

	public void imprime() {
		System.out.println("Nome: " + nome);
		System.out.println("RG: " + rg);
		System.out.print("Endereco: " + endereco.getRua());
		System.out.println(" , " + endereco.getNumero());
	}

	//getters e setters omitidos
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}
	
	public String toString() {
        String tmpPessoa = "Nome: " + nome + "\n";
        tmpPessoa += "RG: " + rg + "\n";
        tmpPessoa += "Endereco " + endereco.getRua() + ", " + endereco.getNumero();
        return tmpPessoa;
    }


}
