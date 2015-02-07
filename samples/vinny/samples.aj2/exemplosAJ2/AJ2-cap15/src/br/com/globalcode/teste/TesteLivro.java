package br.com.globalcode.teste;

import br.com.globalcode.model.Livro;

/**
 * Esta é a classe criada para testar o funcionamento
 * da classe Livro.
 * 
 * 
 * @author Globalcode
 * @version 1.0
 *
 */
public class TesteLivro {

    public static void main(String args[]) {
        String titulo = "A Historia da Globalcode";
        Livro l = new Livro(titulo, "Globalcode", "Globalpress", "1234-56789");
        System.out.println(l.getNome());
    }
}
