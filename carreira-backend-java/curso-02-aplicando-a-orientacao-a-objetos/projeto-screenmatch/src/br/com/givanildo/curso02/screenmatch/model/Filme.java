package br.com.givanildo.curso02.screenmatch.model;

import br.com.givanildo.curso02.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;


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

}
