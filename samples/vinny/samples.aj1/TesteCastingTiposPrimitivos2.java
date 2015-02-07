class TesteCastingTiposPrimitivos2 {
	public static void main(String[] args){
		byte b = -127;
		int inteiro = 12;
		char caractere = 'f';
		long numeroLong = 901;
		float numeroFloat = 990.99f;
		double numeroDouble = 90.98;

		System.out.println("byte = " + b);
		System.out.println("caracter = " + caractere);
		System.out.println("inteiro = " + inteiro);
		System.out.println("numeroLong = " + numeroLong);
		System.out.println("numeroFloat = " + numeroFloat);
		System.out.println("numeroDouble = " + numeroDouble);

		//
		inteiro = caractere;
		System.out.println("caracter 'f' sendo visto como inteiro = " + inteiro);

		//
		inteiro = b;
		System.out.println("byte -127 sendo visto como inteiro = " + inteiro);

		//
		inteiro = (int) numeroFloat;
		System.out.println("float 990.99f sendo visto como inteiro = " + inteiro);

		//
		b = (byte) inteiro;
		System.out.println("inteiro " + inteiro + " sendo visto como byte = " + b);
	}
}