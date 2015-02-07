package br.com.globalcode.testes;
import br.com.globalcode.beans.Pessoa;

public class TesteComparacao {
    public static void main(String[] args) {
    	
        Pessoa p1 = new Pessoa("Gabriela", 1112345L, "01/01/1980");
        Pessoa p2 = new Pessoa("Gabriela", 1112345L, "01/01/1980");

        if (p1 == p2) {
            System.out.println("p1 = p2 utilizando comparador ==");
        } else
            System.out
            .println("p1 eh diferente de p2 utilizando comparador ==");
    }
}
