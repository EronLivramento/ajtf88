package br.com.globalcode.exemplos.exceptions;

public class ExemploFinally {
	public static void main(String[] args) {
        int i = 23;
        int j = 0;

        try {
            double res = i / j;
            // Impress�o do resultado da divis�o
            System.out.println(i + " / " + j + " = " + res);
        }

        catch (ArithmeticException e) {
            System.out.println("---------- Tratamento do Erro ---------");
            System.out.println("Mensagem de erro para o usuario:");
            System.out.println("Divisao invalida! " + e.getMessage());
            System.out.println("\nSTACK TRACE:");
            e.printStackTrace();
            System.out.println("--------------------------------------");
        }

        finally {
            System.out.println("Passou pelo finally");
        }
    }

}
