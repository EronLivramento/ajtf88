package br.com.globalcode.util.erros;

import java.io.File;

public class CriadorArquivos {

    public void criarArquivo(String name) {
        // Criação de um objeto da classe File representando o arquivo
        // com o nome name
        File f = new File(name);
        // Tentativa de criar um arquivo em disco
        f.createNewFile();
    }
}
