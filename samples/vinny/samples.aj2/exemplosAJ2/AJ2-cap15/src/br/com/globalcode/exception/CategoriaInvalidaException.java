package br.com.globalcode.exception;

/**
 * Esta classe representa a exceção gerada quando se tenta designar uma
 * categoria inválida a um objeto.
 * 
 * Exemplo:
 * 
 * <pre>
 * Livro l = new Livro();
 * l.setCategoria(0125);
 * </pre>
 * 
 * Caso não exista a categoria 0125 será lançada a exceção
 * CategoriaInvalidaException
 * 
 * @author Globalcode
 * @version 1.0
 * @see www.globalcode.com.br
 */

public class CategoriaInvalidaException extends Exception {

    public CategoriaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
