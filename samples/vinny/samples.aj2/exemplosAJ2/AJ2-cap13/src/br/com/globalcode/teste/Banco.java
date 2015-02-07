package br.com.globalcode.teste;

public class Banco {
	public Conta abrirConta(TipoConta tipo) {
		Conta conta = null;
		if(tipo==TipoConta.CONTA_CORRENTE) {
			conta = new ContaCorrente();
		} else {
			conta = new ContaPoupanca();
		}
		assert conta != null : "a conta nao foi criada!!";
		return conta;
	}
}
