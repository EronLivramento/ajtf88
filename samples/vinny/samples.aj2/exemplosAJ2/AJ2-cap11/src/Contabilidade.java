public class Contabilidade {

	public void gerarDemonstrativo(Funcionario func) {
		System.out.println("O funcionario: " + func.getNome());
		System.out.println("Recebeu o pagamento de " + func.calculaPagamento());
	}
}
