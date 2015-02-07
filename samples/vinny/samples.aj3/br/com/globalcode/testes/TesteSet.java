package br.com.globalcode.testes;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {
	public static void main(String[] args) {
		Set nomes = new HashSet();
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Ana Paula");
		nomes.add("Amanda");
		nomes.add("Joao");
		
		Iterator iterator = nomes.iterator();
		
		int i = 0;
		System.out.println("Lista dos Nomes: \n");
		while (iterator.hasNext()){
			String nome = (String) iterator.next();
			System.out.println("Nome["+ i++ + "] " + nome);
		}
	}
}
