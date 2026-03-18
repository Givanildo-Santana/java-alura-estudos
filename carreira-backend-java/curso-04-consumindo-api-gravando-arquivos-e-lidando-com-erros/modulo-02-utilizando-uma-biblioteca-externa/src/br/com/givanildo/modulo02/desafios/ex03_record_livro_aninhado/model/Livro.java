package br.com.givanildo.modulo02.desafios.ex03_record_livro_aninhado.model;

public class Livro {
    private String titulo;
    private String autor;
    private Editora editora;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    @Override
    public String toString(){
       return String.format("%s Informações do livro %s\n\nTitulo: %s\nAutor: %s\nEditora: %s\n\n%s","*".repeat(10), "*".repeat(10), getTitulo(),getAutor(),getEditora().getNome(), "*".repeat(42));
    }
}
