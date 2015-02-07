package aj2.cap10.cert;

class Foo {
	void foo() {
		System.out.println("Inside foo method");
	}
}

abstract class Bar extends Foo {
	abstract void bar();
}

abstract class Baz extends Bar {
}

class Xyz extends Baz {
	void bar() {
		System.out.println("Inside overriden bar method");
	}
}
