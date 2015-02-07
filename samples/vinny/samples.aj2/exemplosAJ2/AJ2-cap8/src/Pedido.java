public class Pedido {

	//declaração de constantes
	public final static int NOVO = 1;
	public final static int APROVADO = 2;
	public final static int CANCELADO = 3;
	
	//declaração de atributos
	private final int codigo;
	private int status;
	
	public Pedido(int cod) {
		this.codigo = cod;
		this.setStatus(Pedido.NOVO);
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getStatus() {
		return status;
	}
}
