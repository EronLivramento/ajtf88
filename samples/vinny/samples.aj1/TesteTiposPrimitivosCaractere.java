class TesteTiposPrimitivosCaractere {
	public static void main(String[] args){

		char c = 'a';
		System.out.println("c = 'a' ==> c = " + c);

		char asc = 94;
		char asc2 = 0X006F;
		
		asc++;
		System.out.println("asc = 94 ==> asc = " + asc);

		char espaco = '\u0000';
		System.out.println("espaco = '\\u0000' ==> espaco = " + espaco);

		char carinha = '\u174E';
		System.out.println("carinha = '\\u0001' ==> carinha = " + carinha);
		
	}
}