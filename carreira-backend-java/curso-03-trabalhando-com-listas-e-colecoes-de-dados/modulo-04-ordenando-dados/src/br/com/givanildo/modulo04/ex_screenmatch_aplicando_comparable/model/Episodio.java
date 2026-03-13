package br.com.givanildo.modulo04.ex_screenmatch_aplicando_comparable.model;

import br.com.givanildo.modulo04.ex_screenmatch_aplicando_comparable.calculos.Classificavel;

public class Episodio implements Classificavel {

    private String serie;
    private String nome;
    private int numero;
    private int totalAvaliacoes;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getClassificacao() {
        if (totalAvaliacoes > 100) {
            return 4;
        }
        else {
            return 2;
        }
    }
}


