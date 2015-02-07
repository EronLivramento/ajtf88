class TesteOperadorInversao {
	public static void main(String[] args){
		int i = 38;
		System.out.println("38 invertido = " + ~i);

		i = 39;
		System.out.println("39 invertido = " + ~i);

		i = -40;
		System.out.println("-40 invertido = " + ~i);

		short s = 12;
		//

		int shortInvertido = ~s;
		System.out.println("12 invertido = " + shortInvertido);

		char c = 'a';
		//
		//
		//

		int charInvertido = ~c;
		System.out.println("'a' invertido = " + charInvertido);
	}
}