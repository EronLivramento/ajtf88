public class TesteSobrescrita {
	public static void main(String[] args) {

		// Criando um endereco
		Endereco end1 = new Endereco("Rua das tulipas", 1200);

		// Criando a pessoa p e imprimindo seus dados
		Pessoa p = new Pessoa(end1, "Maria da Silva", "9876543");
		p.imprime();
		
		//Imprimindo uma linha em branco
		System.out.println();

		// Criando o funcionario f e imprimindo seus dados
		Funcionario f = new Funcionario(end1, "Pedro da Silva", "1234545",
				123434L, 10000, "16/04/2001");
		f.imprime();
	}
}
