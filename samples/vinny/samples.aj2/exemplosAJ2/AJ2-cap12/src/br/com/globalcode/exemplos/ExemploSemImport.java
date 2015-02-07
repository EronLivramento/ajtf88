package br.com.globalcode.exemplos;

public class ExemploSemImport {
	   public static void main(String[] args) {
	        java.util.Date data = new java.util.Date();
	        // A data do pacote java.sql dever� ser constru�da passando
	        // um long referente ao n�mero de milisegundos desde 01/01/1970
	        // Obt�m-se o n�mero de milisegundos desde 01/01/1970 chamando
	        // o m�todo getTime da classe java.util.Date
	        long miliSegundos = data.getTime();
	        java.sql.Date dataSQL = new java.sql.Date(miliSegundos);

	        System.out.println("java.util.Date =  " + data);
	        System.out.println("java.sql.Date =  " + dataSQL);
	    }
}
