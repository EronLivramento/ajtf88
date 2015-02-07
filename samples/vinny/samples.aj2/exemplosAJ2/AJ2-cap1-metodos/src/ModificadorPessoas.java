/*
 * Classe presente apenas na primeira versão da apostila e removida
 * em versões posteriores.
 * 
 */
class ModificadorPessoas {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		System.out.println("Valores iniciais para pessoa p:");
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		ModificadorPessoas mp = new ModificadorPessoas();
		mp.modificaPessoa(p);
		System.out.println("Valores atuais para pessoa p:");
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
	}
	void modificaPessoa(Pessoa pessoa) {
		pessoa.nome = "Joao";
		pessoa.idade = 45;
	}
}