class TesteOperadoresAritmeticos {
	public static void main(String[] args){
		int a = 12345, b = 222222;
		int meuInt;
		long meuLong;
		long meuLongComCast;
		int mod;
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);

		int operando1 = 3;
		int operando2 = 2;
		double resultado = operando1 / operando2;
		System.out.println(" 3 / 2  = " + resultado);

		meuInt = a + b;
		System.out.println(" a + b (como inteiro) = " + meuInt);

		meuInt = b - a;
		System.out.println(" b - a  (como inteiro) = " + meuInt);
		meuInt = a * b;

		System.out.println(" a * b (como inteiro) = " + meuInt);
		//
		meuLong = a * b;
		System.out.println(" a * b (armazenados em um long) = " + meuLong);
		//
		//
		meuLongComCast = (long) a * b;
		System.out.println(" a * b (como long) = " + meuLongComCast);

		meuLongComCast = (long) a / b;
		System.out.println(" a / b (como long) = " + meuLongComCast);
		//
		mod = 12 % 4;

		System.out.println(" 12%4 = " + mod);
		//
		mod = 15 % 2;
		System.out.println(" 15%2 = " + mod);
	}
}