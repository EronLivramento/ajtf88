/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
  	for (int numero=100; numero<= 200; numero++){
  		imprimaDivisibilidade(numero);
  	}
  }

  static void imprimaDivisibilidade(int numero){
  		String mensagem = "";
  		boolean divisivelPor2 = numero % 2 == 0;
  		boolean divisivelPor3 = numero % 3 == 0;
  		boolean divisivelPor6 = divisivelPor2 && divisivelPor3;
  		if (divisivelPor6)
  			mensagem = numero + " é divisível por 6";
  		else if (divisivelPor3)
  			mensagem = numero + " é divisível por 3";
  		else if (divisivelPor2)
  			mensagem = numero + " é divisível por 2";
  		System.out.println(mensagem);
  	}
}
