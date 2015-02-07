package br.com.globalcode.testes;
import java.util.ArrayDeque;
import java.util.Deque;

public class TesteDeque {
	public static void main(String[] args) {
		Deque nomes = new ArrayDeque();
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Ana Paula");
		nomes.add("Amanda");

		while(!nomes.isEmpty()) {
			System.out.println(nomes.pollLast());
		}
	}
}
