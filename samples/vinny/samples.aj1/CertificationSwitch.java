/**
 * What is the output of the following code when compiled and run?
 * <br/>
 * Select two correct answers.
 * <br/>
 * 
 */
class CertificacaoSwitch {
	public static void main(String[] args){
		int y4 = 0;
		while (y4++ < 5){
			switch (y4 % 2) {
				default: 
					System.out.println("default ");
					break;
				case 1:
					System.out.println("1 ");
					break;					
			}
		}		
	}
}
/**
 * a) Prints: 1 1 default 1 default
 * b) The code compiles and runs fine
 * c) Prints: 1 default 1 default 1
 * d) Prints: default 1 default 1 default
 * e) Prints: default default 1 default 1
 */
