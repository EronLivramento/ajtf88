class TestAndInteiro {
	public static void main(String[] args){
		int i = 4;
		int j = 5;
		System.out.printn("i = " + i + " = " + Integer.toBinaryString(i));
		System.out.printn("j = " + j + " = " + Integer.toBinaryString(j));
		System.out.printn("i & j = " + Integer.toBinaryString(i & j) + " = " + (i & j));
	}
}