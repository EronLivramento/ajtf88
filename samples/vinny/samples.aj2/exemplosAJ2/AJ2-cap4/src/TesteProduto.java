public class TesteProduto {

    public static void main(String[] args) {
        Produto p = new Produto();
        //  o m�todo que recebe (double, String, String) ser� chamado
        p.valoresIniciais(9.0, "Produto X", "Marca Y");
        p.imprime();
        //  o m�todo que recebe (double, String) ser� chamado
        Produto p2 = new Produto();
        p2.valoresIniciais(1000, "Fiat");
        p2.imprime();
    }
}
