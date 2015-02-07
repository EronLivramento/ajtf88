package aj2.cap8.cert;

public class Bar extends Foo{
	static void method() {
		System.out.println("Inside bar method!!");
	}
	
	public static void main(String[] args) {
		Bar b = new Bar();
	}
}
