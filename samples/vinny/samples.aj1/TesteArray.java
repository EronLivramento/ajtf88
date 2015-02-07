class TesteArray {
	public static void main(String[] args){
		//
		float[] teste = {1F, 2.5F, 3F, 4.12F, 5.6F };

		System.out.println("--- Imprimindo os elementos do array ---");	
		for (int i=0; i < teste.length; i++){
			//
			System.out.println(teste[i]);
		}

		//
		int numeroCaracteres = 26;
		//
		int ascCaractereA = 65;
		//
		char[] arrayCaractere = new char[numeroCaracteres];
		//
		for (int i=0; i < numeroCaracteres; i++){
			arrayCaractere[i] = (char) (ascCaractereA + i);
		}
		System.out.println(arrayCaractere);
	}
}