/**
 * 
 * What will be printed out if you attempt to compile and run the following code?
 *
 */ 
class QuestaoSwitch {
	public static void main(String[] args){
		int variavel = 1;
		switch (variavel) {
			case 0: 
				System.out.println("zero");
				break;
			case 1: 
				System.out.println("um");
			default: 
				System.out.println("default");
			case 2: 
				System.out.println("dois");
		}		
	}
}
/**
 * a) um
 * b) um, default
 * c) um, dois, default
 * d) default
 * e) um, default, dois
 *
 */ 
