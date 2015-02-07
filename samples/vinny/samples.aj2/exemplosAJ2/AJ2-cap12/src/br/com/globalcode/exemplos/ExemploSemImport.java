package br.com.globalcode.exemplos;

public class ExemploSemImport {
	   public static void main(String[] args) {
	        java.util.Date data = new java.util.Date();
	        // A data do pacote java.sql deverá ser construída passando
	        // um long referente ao número de milisegundos desde 01/01/1970
	        // Obtém-se o número de milisegundos desde 01/01/1970 chamando
	        // o método getTime da classe java.util.Date
	        long miliSegundos = data.getTime();
	        java.sql.Date dataSQL = new java.sql.Date(miliSegundos);

	        System.out.println("java.util.Date =  " + data);
	        System.out.println("java.sql.Date =  " + dataSQL);
	    }
}
