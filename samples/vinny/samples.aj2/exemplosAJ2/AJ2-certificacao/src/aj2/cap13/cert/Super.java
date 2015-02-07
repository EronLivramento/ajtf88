package aj2.cap13.cert;

import java.io.IOException;

public class Super {

	void method() throws IOException {
		System.out.println("Inside Super");
		throw new IOException();
	}
	
	public static void main(String[] args) {
		Base base = new Base();
		try {
			base.method();
		} catch (IOException e) {
			System.out.println("Inside catch");
		}
	}
}

class Base extends Super {
	void method() {
		System.out.println("Inside Base");
	}
}