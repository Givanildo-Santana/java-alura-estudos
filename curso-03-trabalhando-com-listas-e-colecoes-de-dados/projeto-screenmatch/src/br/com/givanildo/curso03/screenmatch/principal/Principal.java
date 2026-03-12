package br.com.givanildo.curso03.screenmatch.principal;
import br.com.givanildo.curso03.screenmatch.calculos.FiltroRecomendacao;
import br.com.givanildo.curso03.screenmatch.model.Filme;
import br.com.givanildo.curso03.screenmatch.model.Serie;
import br.com.givanildo.curso03.screenmatch.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        ArrayList<Filme> filmes = new ArrayList<>();

        Filme favorito = new Filme();
        favorito.setNome("Vingadores: Ultimato");
        favorito.setAnoDeLancamento(2019);
        favorito.setDuracaoEmMinutos(181);
        favorito.setIncluidoNoPlano(true);
        favorito.exibeFichaTecnica();
        favorito.avalia(8);
        favorito.avalia(9);
        filtro.filtra(favorito);

        Filme outro = new Filme();
        outro.setNome("Capitão América: O Primeiro Vingador");
        outro.setAnoDeLancamento(2011);
        outro.setDuracaoEmMinutos(124);
        outro.setIncluidoNoPlano(true);
        outro.exibeFichaTecnica();
        filtro.filtra(outro);

        filmes.add(favorito);
        filmes.add(outro);

        System.out.println(" ");
        System.out.println("Filmes: " + filmes);

        Serie serie = new Serie();
        serie.setNome("Loki");
        serie.setAnoDeLancamento(2021);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(2);
        serie.setEpisodiosPorTemporada(6);
        serie.setMinutosPorEpisodio(50);
        serie.exibeFichaTecnica();
        filtro.filtra(serie);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println(" ");
        System.out.printf("Tempo necessário para maratonar tudo: %d minutos ",calculadora.getTempoTotal());
    }

}
