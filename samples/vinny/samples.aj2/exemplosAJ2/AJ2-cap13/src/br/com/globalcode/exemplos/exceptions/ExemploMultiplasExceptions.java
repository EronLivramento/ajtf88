package br.com.globalcode.exemplos.exceptions;

public class ExemploMultiplasExceptions {
	public static void main(String[] args) {
        try {
            String num1 = args[0];
            String num2 = args[1];
            int i = Integer.parseInt(num1);
            int j = Integer.parseInt(num2);
            double res = i / j;
            System.out.println(i + " / " + j + " = " + res);
        } catch (ArithmeticException e) {
            System.out.println("---------- Tratamento do Erro ---------");
            System.out.println("Mensagem de erro para o usuario:");
            System.out.println("Divisao invalida! " + e.getMessage());
            System.out.println("\nSTACK TRACE:");
            e.printStackTrace();
            System.out.println("--------------------------------------");
        } catch (NumberFormatException e) {
            System.out.println("---------- Tratamento do Erro ---------");
            System.out.println("Mensagem de erro para o usuario:");
            System.out.println("Dados invalidos! " + e.getMessage());
            System.out.println("\nSTACK TRACE:");
            e.printStackTrace();
            System.out.println("--------------------------------------");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("---------- Tratamento do Erro ---------");
            System.out.println("Mensagem de erro para o usuario:");
            System.out.println("Digite dois parametros no main! " + e.getMessage());
            System.out.println("\nSTACK TRACE:");
            e.printStackTrace();
            System.out.println("--------------------------------------");
        } finally {
            System.out.println("Passou pelo finally");
        }
    }
}
