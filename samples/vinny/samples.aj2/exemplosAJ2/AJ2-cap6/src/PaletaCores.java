
public class PaletaCores {
	private static int[] cores = new int[7];

	PaletaCores() {
		System.out.println("Criando instancia da classe PaletaCores");
	}

	static {
		// hipoteticamente, serão atribuídos números inteiros às cores,
		// como por exemplo: 0 branco, 1 azul, 2 vermelho, etc...
		System.out.println("Inicializando array de cores"
				+ " no bloco de inicializacao estatico...");
		for (int i = 0; i < cores.length; i++) {
			cores[i] = i;
		}
	}
}
