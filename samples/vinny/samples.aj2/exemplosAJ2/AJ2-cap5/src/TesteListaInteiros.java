public class TesteListaInteiros {
	public static void main(String[] args) {
		//Faz a leitura do tamanho da lista de inteiros a ser criada
		//Esta valor deve ser passado como par�metro na execu��o do c�digo.
		int tamanhoLista = Integer.parseInt(args[0]);
		for(int i = 0; i < 5; i++) {
			ListaInteiros lista = new ListaInteiros(i,tamanhoLista);
		}
		System.out.println("Finalizando programa");
	}
}
