class TesteOperadorInstanceof {
	public static void main(String[] args){
		String nome = "";
		if (nome instanceof String) 
			System.out.println("nome é String");
		else 
			System.out.println("nome não é String");
	}
}