

public class TesteImpressaoEnum {
	public static void main(String[] args) {
		Cliente c = new Cliente("Maria", "maria@gc.com.br",
				Cliente.TipoCliente.PESSOA_FISICA);
		System.out.println("Tipos de cliente:");
		for (Cliente.TipoCliente tipo : Cliente.TipoCliente.values()) {
			System.out.println(tipo);
		}
	}
}
