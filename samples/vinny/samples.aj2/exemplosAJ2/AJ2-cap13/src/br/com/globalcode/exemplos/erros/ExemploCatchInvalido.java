package br.com.globalcode.exemplos.erros;

import java.io.IOException;

public class ExemploCatchInvalido {
	public static void main(String[] args) {
		try {
			System.out.println("Dentro do bloco try");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
