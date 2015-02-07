public class ExemploSubClasse extends ExemploSuperClasse {
	int campo = 15;
	{
		System.out.println("Bloco de inicializacao da subclasse");
	}

	ExemploSubClasse() {
		System.out.println("Construtor da subclasse");
	}
}
