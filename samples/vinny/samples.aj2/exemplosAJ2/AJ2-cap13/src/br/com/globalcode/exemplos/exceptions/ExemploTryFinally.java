package br.com.globalcode.exemplos.exceptions;

public class ExemploTryFinally {
	public static void main(String[] args) {
		int i = 23;
		int j = 0;

		try {
			double res = i / j;
			// Impressão do resultado da divisão
			System.out.println(i + " / " + j + " = " + res);
		} finally {
			System.out.println("Passou pelo finally");
		}
	}
}
