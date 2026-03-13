package br.com.givanildo.modulo04.ex_screenmatch_aplicando_comparable.model;

import br.com.givanildo.modulo04.ex_screenmatch_aplicando_comparable.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;


    public Serie(String nome, int anoDeLancamento){
        super(nome,anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public void exibeFichaTecnica() {
        System.out.println(" ");
        System.out.println("Nome da Serie: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("Incluido no plano: " + isIncluidoNoPlano());

    }


    @Override
    public int getClassificacao() {
        return (int) (pegarMedia() / 2);
    }

    @Override
    public String toString() {
        return String.format("Serie: %s (%d)",this.getNome(),this.getAnoDeLancamento());
    }
}
