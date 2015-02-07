package br.com.globalcode.testes;

import br.com.globalcode.beans.Pessoa;

public class TesteHashCode2 {
    public static void main(String[] args) {
        Pessoa p3 = new Pessoa("Fernanda Santos", 109951162777L, "09/05/1964");
        Pessoa p4 = new Pessoa("Fernanda Santos", 75591424409L, "17/03/1985");
        System.out.println("codigo hash de p3: " + p3.hashCode());
        System.out.println("codigo hash de p4: " + p4.hashCode());
        System.out.println("p3 equals p4: " + p3.equals(p4));
    }
}
