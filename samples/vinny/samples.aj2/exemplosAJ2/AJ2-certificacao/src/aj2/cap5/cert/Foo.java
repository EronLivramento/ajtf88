package aj2.cap5.cert;

public class Foo {

	{
		System.out.println("inside instance initializer");
	}
	
	Foo(byte b) {
		System.out.println("inside constructor with byte");
	}

	Foo(short s) {
		System.out.println("inside constructor with short");
	}

	Foo(char c) {
		System.out.println("inside constructor with char");
	}

	Foo(int i) {
		System.out.println("inside constructor with int");
	}

	public static void main(String[] args) {
		Foo foo = new Foo(2);
	}

}
