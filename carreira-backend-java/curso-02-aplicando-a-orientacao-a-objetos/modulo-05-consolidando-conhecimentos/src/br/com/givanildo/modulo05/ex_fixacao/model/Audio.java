package br.com.givanildo.modulo05.ex_fixacao.model;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;


    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public int getTotalCurtidas() {
        return totalCurtidas;
    }


    public double getClassificacao() {
        return classificacao;
    }
}
