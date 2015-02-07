package aj2.cap8.cert;

class Animal {
	private String name;
	Animal(String name) {
		System.out.println("Inside Animal's constructor");
		this.name = name;
	}
}

class Dog extends Animal {
	Dog() {
		System.out.println("Inside dog's constructor");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
	}
}