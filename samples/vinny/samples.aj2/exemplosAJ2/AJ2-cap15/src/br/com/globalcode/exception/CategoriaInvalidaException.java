package br.com.globalcode.exception;

/**
 * Esta classe representa a exce��o gerada quando se tenta designar uma
 * categoria inv�lida a um objeto.
 * 
 * Exemplo:
 * 
 * <pre>
 * Livro l = new Livro();
 * l.setCategoria(0125);
 * </pre>
 * 
 * Caso n�o exista a categoria 0125 ser� lan�ada a exce��o
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
