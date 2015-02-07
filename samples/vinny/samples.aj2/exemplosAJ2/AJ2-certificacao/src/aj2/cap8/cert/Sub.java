package aj2.cap8.cert;

public class Sub extends Super {
	private int value = 15;
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
	}
}
