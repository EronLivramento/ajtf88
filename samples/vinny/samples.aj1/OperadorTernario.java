/**
 *
 * What is the output of the following code when compiled and run?
 * <br/>
 */
class OperadorTernario {
	public static void main(String[] args){
		boolean c = false;
		String str = (c=!c)?
							(c=!c)?"Hello":"hello":
							(c=!c)?"world":"World";
		System.out.println(str);
	}
}

/**
 * Select one correct answer.
 * <br/>
 * a) Prints: helloWorld
 * b) Prints: hello
 * c) Compilation error.
 * d) Prints: Hello
 * e) Prints: Helloworld
 */