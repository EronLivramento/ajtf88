

public class TesteClienteEnumeracao {
	public static void main(String[] args) {
		Cliente c = new Cliente("Maria", "maria@gc.com.br",
				Cliente.TipoCliente.PESSOA_FISICA);
		System.out.println("tipo de cliente criado = " + c.getTipo());
	}
}
