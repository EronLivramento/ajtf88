package br.com.globalcode.testes;
import br.com.globalcode.beans.Produto;
import br.com.globalcode.database.ProdutoDB;

public class TesteProdutoDB {

	public static void main(String args[]) throws Exception {
		ProdutoDB db = new ProdutoDB();
		db.createTable();
		String nome = "";
		int preco = 0;
		Produto produto = null;
		int id = 0;

		if (args.length == 2) {
			System.out.println("O produto sera inserido no BD");
			nome = args[0];
			preco = Integer.parseInt(args[1]);
			produto = new Produto(nome, preco);
		} else if (args.length == 3) {
			System.out.println("O produto sera alterado no BD");
			nome = args[0];
			preco = Integer.parseInt(args[1]);
			id = Integer.parseInt(args[2]);
			produto = new Produto(id, nome, preco);
		} else {
			System.out.println("Sintaxe para utilizacao deste programa");
			System.out.println("Para inserir um novo produto");
			System.out.println("<nome do produto> <preco do produto>");
			System.out.println("Para alterar um produto");
			System.out.println("<nome do produto> <preco do produto> <id >");
			return;
		}
		db.save(produto);
	}
}
