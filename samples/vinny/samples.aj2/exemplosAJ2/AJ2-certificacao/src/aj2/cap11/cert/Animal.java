package aj2.cap11.cert;

class Animal {
	String getName() { return "animal"; }
	Animal getType() { return this; }
}
class Mammal extends Animal {
	// insert code here
}
class Dog extends Mammal { }
