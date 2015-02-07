class TesteOperadorTernario {
	public static void main(String[] args){
		String mensagem = "O número é ";
		int numero = 15;
		int resto = numero % 2;
		mensagem += (resto == 0)? " Par " : "Impar";
		if (resto == 0){
			mensagem += " Par ";
		} else {
			mensagem += " Impar ";
		}
		System.out.println(mensagem);
	}
}