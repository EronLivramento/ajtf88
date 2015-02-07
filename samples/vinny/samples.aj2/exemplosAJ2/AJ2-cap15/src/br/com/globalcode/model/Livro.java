package br.com.globalcode.model;

import br.com.globalcode.exception.CategoriaInvalidaException;

/**
 * Esta classe representa um Livro. Exemplo:
 * 
 * <pre>
 * Livro l = new Livro();
 * l.setNome(&quot;A História da Globalcode&quot;);
 * </pre>
 * 
 * @author Globalcode
 * @version 1.0
 * @see www.globalcode.com.br
 */

public class Livro {

    private String nome;
    private int categoria;
    private String ISBN;
    private String autor;
    private String editora;
    public static final int ROMANCE = 1;
    public static final int HISTORIA = 2;
    public static final int INFORMATICA = 3;

    /**
     * @param nome
     *            Nome do livro
     * @param autor
     *            Autor do livro
     * @param editora
     *            Editora do livro
     * @param ISBN
     *            ISBN do livro
     */
    public Livro(String nome, String autor, String editora, String ISBN) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.ISBN = ISBN;
    }

    /**
     * @param nome
     *            Nome do livro
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param categoria
     *            Categoria do livro
     * @throws CategoriaInvalidaException
     */
    public void setCategoria(int categoria) throws CategoriaInvalidaException {
        if (categoria == ROMANCE || categoria == HISTORIA
                || categoria == INFORMATICA) {
            this.categoria = categoria;
        } else
            throw new CategoriaInvalidaException("Categoria inválida");
    }

    /**
     * @param ISBN
     *            ISBN do livro
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @param autor
     *            Autor do livro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @param editora
     *            Editora do livro
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return nome do livro
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return categoria do livro
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @return ISBN do livro
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @return autor do livro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return editora do livro   
     */
    public String getEditora() {
        return editora;
    }
}
