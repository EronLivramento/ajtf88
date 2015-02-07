package br.com.globalcode.testes;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import br.com.globalcode.beans.Pessoa;

public class TesteHashMap {
	public static void main(String[] args){
		Pessoa p1 = new Pessoa("Marcio Oliveira", 11111L, "04/10/1970");
		Pessoa p2 = new Pessoa("Armando Silva", 22222L, "11/12/1987");
		Pessoa p3 = new Pessoa("Fernanda Santos", 33333L, "09/05/1964");
		
		Map pessoas = new HashMap();
		pessoas.put(p1.getRg(), p1);
		pessoas.put(p2.getRg(), p2);
		pessoas.put(p3.getRg(), p3);
		
		imprimeMap(pessoas);
		removeElemento(pessoas, 22222L);
		imprimeMap(pessoas);
	}
	public static void imprimeMap(Map map){
		System.out.println("\n=========Impressao do Map=========\n");
		Set chaves = map.keySet();
		Iterator i = chaves.iterator();
		//através do iterator i vamos navegar no set chaves
		while (i.hasNext()){
			//recuperando as chaves armazenadas em chaves para então obter 
			//o valor associado
			Long chave = (Long) i.next();
			//recuperando o nome da pessoa através do rg no hash map das pessoas
			System.out.println("[Chave]: " + chave);
			System.out.println(map.get(chave) + "\n");
		}
	}
	public static void removeElemento(Map map, Long chave){
		Pessoa valorRemovido = null;
		//verificando se a chave existe no HashMap
		if(map.containsKey(chave)){
			System.out.println("\n=====Removendo Elemento do Map=====\n");
			//Lembrar de fazer cast de objetos que vem do HashMap
			valorRemovido = (Pessoa)map.remove(chave);
			System.out.println("Valor Removido: " + valorRemovido);
		}else 
			System.out.println("Chave nao encontrada no HashMap");
	}
}
