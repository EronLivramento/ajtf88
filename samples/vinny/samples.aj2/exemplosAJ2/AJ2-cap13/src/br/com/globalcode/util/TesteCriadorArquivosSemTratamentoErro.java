package br.com.globalcode.util;

public class TesteCriadorArquivosSemTratamentoErro {

    public static void main(String[] args) {
        CriadorArquivos ca = new CriadorArquivos();
        ca.criarArquivo("teste.txt");
    }
}
