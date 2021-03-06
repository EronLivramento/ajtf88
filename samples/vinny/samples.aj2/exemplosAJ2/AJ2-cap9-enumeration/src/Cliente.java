

public class Cliente {

	public enum TipoCliente { PESSOA_FISICA, PESSOA_JURIDICA };
	private TipoCliente tipo;
	private String nome;
	private String email;

	public Cliente(String nome, String email, TipoCliente tipo) {
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

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}
}
