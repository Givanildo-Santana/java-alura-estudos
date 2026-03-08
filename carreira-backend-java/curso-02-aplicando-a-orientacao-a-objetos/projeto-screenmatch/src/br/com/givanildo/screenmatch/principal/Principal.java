package br.com.givanildo.screenmatch.principal;
import br.com.givanildo.screenmatch.calculos.FiltroRecomendacao;
import br.com.givanildo.screenmatch.model.Filme;
import br.com.givanildo.screenmatch.model.Serie;
import br.com.givanildo.screenmatch.calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();

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
