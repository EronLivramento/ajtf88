
public class TesteCalculadoraAmbigua {
	public static void main(String[] args) {
		CalculadoraAmbigua calc = new CalculadoraAmbigua();
		calc.soma(24, 25);		//chama-se soma(long,long)
		byte a = 24;
		byte b = 25;
		calc.soma(a,b);			//chama-se soma(byte,byte)
		calc.soma((byte)24, (byte)25); //chama-se soma(byte,byte)
	}
}
