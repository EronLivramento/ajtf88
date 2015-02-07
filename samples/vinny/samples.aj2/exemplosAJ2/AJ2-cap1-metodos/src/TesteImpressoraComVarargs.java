
class TesteImpressoraComVarargs {
	public static void main(String[] args) {
		ImpressoraComVarargs imp = new ImpressoraComVarargs();
		imp.listaNomes("Marcos da Silva", "Roberto da Costa",
				"Ana Maria Soares");
		// metodo que recebe uma String e varargs do tipo double
		imp.listaNotas("Lista de notas recebidas:", 7.5, 8.75, 5.5);
	}
}
