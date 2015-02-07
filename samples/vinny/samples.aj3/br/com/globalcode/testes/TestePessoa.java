package br.com.globalcode.testes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import br.com.globalcode.beans.Pessoa;

public class TestePessoa {

	public static void main(String[] args ) {
		//Criamos varias instancias da classe Pessoa
		Pessoa p1 = new Pessoa ("Joao Silva", 123, "20/05/1965");
		Pessoa p2 = new Pessoa ("Joana Soares", 1,  "28/02/1934");
		Pessoa p3 = new Pessoa ("Mauricio Costa", 1236, "14/07/1977");
		Pessoa p4 = new Pessoa ("Carina Salgado", 11111, "1/05/1982");
		Pessoa p5 = new Pessoa ("Joao Silva", 123, "20/05/1965");
		Pessoa p6 = new Pessoa ("Joao Silva", 1234, "20/05/1965");
		
		Set pessoas = new TreeSet();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		pessoas.add(p6);
		
		System.out.println("----------PESSOAS----------");
		Iterator pessoasIterator = pessoas.iterator();
		while(pessoasIterator.hasNext()){
			System.out.println(pessoasIterator.next());
		}
	}
}
