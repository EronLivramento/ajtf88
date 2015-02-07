class TesteContinue {
	public static void main(String[] args){
		double valorTotal = 15000;
		System.out.println("valor total = " + valorTotal);
		for (int numeroParcelas = 10; numeroParcelas < 20; numeroParcelas++) {

			double parcela = valorTotal / numeroParcelas;

			if (parcela < 1000) {
				System.out.println("Não é possível parcelar em mais vezes, ");
				System.out.println(" pois não é permitido parcelas < 1000");
				continue;
			}
			System.out.println(numeroParcelas + " parcelas de " + parcela);
		}		
	}
}