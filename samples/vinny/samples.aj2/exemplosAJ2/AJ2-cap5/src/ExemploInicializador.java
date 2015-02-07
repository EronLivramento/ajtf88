
public class ExemploInicializador {
	//declaração de atributos
	private int atributo = 15;
	//bloco inicializador
	{
		System.out.println("Dentro do inicializador de instancia");
		System.out.println("Valor do atributo = " + atributo);
	}
	//construtor
	public ExemploInicializador() {
		System.out.println("Dentro do construtor");
	}
}
