

public class Cliente {

	public final static int PESSOA_JURIDICA = 1;
	public final static int PESSOA_FISICA = 2;
	private String nome;
	private String email;
	private int tipo;

	public Cliente(String nome, String email, int tipo) {
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
