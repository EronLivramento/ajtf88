/**
 *
 * 3. What is the output when you try to compile and run the following class, using the command:
 * javac QuestaoMain.java 04 05
 * 
 */
class QuestaoMain {
	public static void main(String[] args){
		if (args.length() > 0){
			for (int i=0; i < args.length(); i++){
				System.out.println("O valor de args: " + args[i]);
			}
		}		
	}
}
/**
 *
 * a) Compile time error
 * b) Runtime error
 * c) Prints: 04 05
 * d) Nothing happens
 */