package br.com.givanildo.screenmatch.principal;

import br.com.givanildo.screenmatch.calculos.CalculadoraDeTempo;
import br.com.givanildo.screenmatch.calculos.FiltroRecomendacao;
import br.com.givanildo.screenmatch.model.Filme;
import br.com.givanildo.screenmatch.model.Serie;
import br.com.givanildo.screenmatch.model.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        ArrayList<Titulo> titulos = new ArrayList<>();

        Filme favorito = new Filme("Vingadores: Ultimato", 2019);
        Filme outro = new Filme("Capitão América: O Primeiro Vingador", 2011);
        Serie serie = new Serie("Loki", 2021);

        favorito.avalia(9);
        outro.avalia(5);
        serie.avalia(8);

        titulos.add(favorito);
        titulos.add(outro);
        titulos.add(serie);

        for (Titulo titulo : titulos) {
            System.out.println(titulo.getNome());

            if (titulo instanceof Filme) {
                Filme filme = (Filme) titulo;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

    }


}
