package br.com.globalcode.util;

import java.io.IOException;

public class TesteCriadorArquivos {

    public static void main(String[] args) {
        try {
            CriadorArquivos ca = new CriadorArquivos();
            ca.criarArquivo("teste.txt");
        } catch (IOException e) {
            System.out.println("---------- Tratamento do Erro ---------");
            System.out
                    .println("Nao foi possível criar o arquivo! " + e.getMessage());
            System.out.println("--------------------------------------");
        }
    }
}
