class TesteCastTiposPrimitivos {
	public static void main(String[] args){
		//
		//
		double d = 125;
		System.out.println("int 125 convertido automaticamente para double" + d);		

		//
		//
		//
		char c = 2154;
		System.out.println(" literal 2154 (int) convertido automat. para char = " + c);

		//
		short s = 'a';
		System.out.println("char 'a' convertido automaticamente para short " + s);

		//
		//
		//
		byte b = 'a';
		System.out.println("char 'a' (literal) convertido automatic. para byte "+ b);

		//
		int i = (int) 5858.0f;
		System.out.println(" float 5658.0f convertido explicitamente para int "+ i);
	}
}