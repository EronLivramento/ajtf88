class Produto {
    private String descricao;
    private String marca;
    private double preco;

    void valoresIniciais(double umPreco, String umaDescricao, String umaMarca) {
        alterarPreco(umPreco);
        setDescricao(umaDescricao);
        setMarca(umaMarca);
    }
    String getDescricao() {
        return descricao;
    }
    void setDescricao(String novaDescricao) {
        descricao = novaDescricao;
    }
    String getMarca() {
        return marca;
    }
    void setMarca(String novaMarca) {
        marca = novaMarca;
    }
    double getPreco() {
        return preco;
    }
    void alterarPreco(double novoPreco) {
        if (novoPreco > 0) {
            preco = novoPreco;
        }
    }
    void aumentarPreco(double porcentagem) {
        if (porcentagem > 0) {
            System.out.println("aumentando o preco em " + porcentagem + " %");
            porcentagem = 1 + (porcentagem / 100);
            preco *= porcentagem;
            System.out.println("Novo preco = " + preco);
        } else {
            System.out.println("aumento deve ser maior do que zero");
        }
    }
    void imprime() {
        System.out.println("------------------------");
        System.out.println("Produto : " + descricao + "\n");
        System.out.println("Marca : " + marca + "\n");
        System.out.println("Preco : " + preco + "\n");
        System.out.println("------------------------");
    }
}
