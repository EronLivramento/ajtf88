package aj2.cap1.cert;

class Foo {

    int i1 = 25;
    int i2;
    char c = 1;
    boolean b;

    public static void main(String... args) {
        Foo foo = new Foo();
        foo.method();
    }

    void method() {
        //boolean b;
        System.out.println(i2);
        System.out.println(b);
    }
}
