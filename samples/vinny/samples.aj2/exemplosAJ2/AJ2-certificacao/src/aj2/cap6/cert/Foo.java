package aj2.cap6.cert;

public class Foo {
	int version = 5;
    static String name = "Mach";

    public static void method(){
        System.out.println(name + version);
    }
    
    public static void main(String[] args) {
    	Foo foo = new Foo();
    	foo.method();
	}
}
