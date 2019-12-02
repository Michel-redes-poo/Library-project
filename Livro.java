
package model;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public String toString() {
        return "\nTítulo: " + titulo + ".\n" + "Autor: " + autor + ".\n" + 
                "Isbn: " + isbn + ".\n" + "Descrição: " + descricao + ".\n";
    }
    
    
    
}
