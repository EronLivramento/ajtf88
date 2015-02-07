package br.com.globalcode.testes;
import java.util.List;
import br.com.globalcode.database.ProdutoDB;

public class TesteProdutoDB3 {

	public static void main(String args[]) throws Exception {
		ProdutoDB db = new ProdutoDB();

		if (args.length == 1) {
			int id = Integer.parseInt(args[0]);
			int qtdRemovidos = db.delete(id);
			System.out.println(qtdRemovidos + " produto(s) removido(s).");
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
