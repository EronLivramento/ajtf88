
public class TesteCalculadoraAmbiguaVarargs {
	public static void main(String[] args) {
		CalculadoraAmbiguaVarargs calc = new CalculadoraAmbiguaVarargs();
		calc.soma(15,20);	//chama-se soma(long,long)
		calc.soma(15,20,25);//chama-se soma(int...)
	}
}
