package br.com.globalcode.testes;
import java.util.List;
import br.com.globalcode.beans.Produto;
import br.com.globalcode.database.ProdutoDB;

public class TesteProdutoDB2 {

	public static void main(String args[]) throws Exception {
		ProdutoDB db = new ProdutoDB();
		if (args.length == 1) {
			int id = Integer.parseInt(args[0]);
			Produto produto = db.getProduto(id);
			if (produto != null) {
				System.out.println("O produto encontrado foi ");
				System.out.println(produto);
			} else
				System.out.println("O produto nao foi encontrado");
		} else {
			List produtos = db.getAllProdutos();
			System.out.println(
				"Foram encontrados " + produtos.size() + " produto(s).");
			for (int i = 0; i < produtos.size(); i++) {
				System.out.println(produtos.get(i));
			}
		}
	}
}
