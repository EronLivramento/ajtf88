public class TesteProduto {

    public static void main(String[] args) {
        Produto p = new Produto();
        //  o método que recebe (double, String, String) será chamado
        p.valoresIniciais(9.0, "Produto X", "Marca Y");
        p.imprime();
        //  o método que recebe (double, String) será chamado
        Produto p2 = new Produto();
        p2.valoresIniciais(1000, "Fiat");
        p2.imprime();
    }
}
