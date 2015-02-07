class TesteOperadoresLogicos {
	public static void main(String[] args){
		int x = 9;
		int y = 0;

		boolean a = x > y && x > 0;
		System.out.println("x > y e x > 0 = "+ a);

		boolean b = y == 0 || x == 0;
		System.out.println("um dos dois e igual a zero = " + b);

		String s = null;
		boolean b = s != null && s.trim().length() > 0;
	}
}