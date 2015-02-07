package br.com.globalcode.exemplos.erros;

public class ExemploMultiplasExceptions {
	public static void main(String[] args) {
		int i = 23;
		int j = 0;
		try {
			double res = i / j;
			// Impress�o do resultado da divis�o
			System.out.println(i + " / " + j + " = " + res);
		} catch (RuntimeException e) {
			System.out.println("Capturei uma RuntimeException");
		} catch (ArithmeticException e) {
			System.out.println("Divisao invalida! ");
		}
	}
}
