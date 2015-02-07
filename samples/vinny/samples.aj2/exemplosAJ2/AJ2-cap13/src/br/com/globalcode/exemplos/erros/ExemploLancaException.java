package br.com.globalcode.exemplos.erros;

public class ExemploLancaException {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("Valor do parametro recebido = " + args[0]);
		} else {
			throw new Exception();
		}
	}
}
