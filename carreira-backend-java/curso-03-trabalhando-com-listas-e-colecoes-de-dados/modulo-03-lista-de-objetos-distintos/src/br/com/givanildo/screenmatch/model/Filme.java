package br.com.givanildo.screenmatch.model;

import br.com.givanildo.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegarMedia() / 2);
    }

        @Override
        public void exibeFichaTecnica() {
        System.out.println(" ");
        System.out.println("Nome do Filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("Incluido no plano: " + isIncluidoNoPlano());
    }

    @Override
    public String toString() {
        return String.format("Filme: %s (%d)",this.getNome(),this.getAnoDeLancamento());
    }


}
