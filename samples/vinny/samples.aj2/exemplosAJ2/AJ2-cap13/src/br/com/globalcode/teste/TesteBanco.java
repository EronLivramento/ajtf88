package br.com.globalcode.teste;

public class TesteBanco {
	public static void main(String[] args) {
		Banco banco = new Banco();
		Conta conta1 = banco.abrirConta(TipoConta.CONTA_POUPANCA);
		System.out.println("Conta poupanca criada com sucesso");
		Conta conta2 = banco.abrirConta(TipoConta.CONTA_CORRENTE);
		System.out.println("Conta corrente criada com sucesso");
	}
}
