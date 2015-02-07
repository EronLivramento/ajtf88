package br.com.globalcode.testes;
public class TesteString {
	public static void main(String args[]) {
		String nome = "Globalcode";
		char inicial = nome.charAt(0);
		System.out.println("Inicial = " + inicial);
		// Saida
		// Inicial = G;
		// concat sample

		String nome1 = "Global";
		String nome2 = "code";
		String nome3 = nome1.concat(nome2);
		System.out.println("Nome:  " + nome3);
		// Saída
		// Nome : Globalcode
		// indexOf sample
	
		String nome4 = new String("Globalcode");
		int posicao = nome4.indexOf("code");
		System.out.println("Posicao:  " + posicao);
		// Saída
		// Posicao : 6
		// toLowerCase

		String nome5 = "GLOBALCode";
		String minusculas = nome5.toLowerCase();
		System.out.println(nome5);
		System.out.println(minusculas);
		// Saida
		// GLOBALCode
		// globalcode
		// trim sample

		String nome6 = " Globalcode ";
		String semEspaco = nome6.trim();
		System.out.println("String com espaco -" + nome6 + "-");
		System.out.println("String sem espaco -" + semEspaco + "-");
		// Saida
		// String com espaço - Globalcode -
		// String sem espaço -Globalcode-

	} // end main
 } // end TesteString
