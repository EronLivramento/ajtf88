class TesteProduto {

    public static void main(String[] args) {
        Produto p = new Produto();
        p.valoresIniciais(9.0, "Produto X", "Marca Y");
        p.imprime();
        p.aumentarPreco(10);
        p.setDescricao("Casual Class");
        p.setMarca("Globalcode");
        p.imprime();
    }
}
