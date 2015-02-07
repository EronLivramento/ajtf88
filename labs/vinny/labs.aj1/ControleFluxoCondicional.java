/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoCondicional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	String nome = "Carolina Pereira";
	int idade = 20;
	String rg = "34.654.789-9";
	char sexo = 'X';
	double salario = 1500.0;
	int anoAtual = 2009;
	double aliquota = 0.20;
	int anoNascimento = anoAtual - idade;
	String sexoPorExtenso;
	String artigo;
	String tratamento;
	String nascido;
	String portador;
	String registrado;
	switch (sexo){
		case 'M': 
			sexoPorExtenso = "masculino";
			artigo = "O";
			tratamento = " Senhor";
			nascido = "nascido";
			portador = "portador";
			registrado = "registrado";
			break;
		case 'F': 
			sexoPorExtenso = "feminino";
			artigo = "A";
			tratamento = " Senhora";
			nascido = "nascida";
			portador = "portadora";
			registrado = "registrada";
			break;
		default:	
			sexoPorExtenso = "indefinido";
			artigo = "O(A)";
			tratamento = " Senhor(a)";
			nascido = "nascido(a)";
			portador = "portador(a)";
			registrado = "registrado(a)";
			break;
	}	
	double impostoDevido = salario * aliquota;
	String textNome = artigo + tratamento + " " + nome;
	String textNasc = ", " + nascido + " no ano de " + anoNascimento;
	String textRg = " "+portador + " do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexoPorExtenso;
	String textTrabalho = ", está " +registrado + " com o salário de R$ " + salario;
	String textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho
	    + textImposto);
  }
}
