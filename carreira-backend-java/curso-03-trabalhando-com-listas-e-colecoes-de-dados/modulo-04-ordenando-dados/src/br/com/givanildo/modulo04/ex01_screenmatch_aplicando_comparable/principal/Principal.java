package br.com.givanildo.modulo04.ex01_screenmatch_aplicando_comparable.principal;

import br.com.givanildo.modulo04.ex01_screenmatch_aplicando_comparable.calculos.FiltroRecomendacao;
import br.com.givanildo.modulo04.ex01_screenmatch_aplicando_comparable.model.Filme;
import br.com.givanildo.modulo04.ex01_screenmatch_aplicando_comparable.model.Serie;
import br.com.givanildo.modulo04.ex01_screenmatch_aplicando_comparable.model.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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

        System.out.println("Lista original de títulos");
        System.out.println(titulos);
        System.out.println(" ");

        System.out.println("Ordenação natural por nome (Comparable implementado em Titulo):");
        Collections.sort(titulos);
        System.out.println(titulos);

        System.out.println(" ");

        System.out.println("Ordenação por ano de lançamento (Comparator externo):");
        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(titulos);

        System.out.println(" ");

        for (Titulo titulo : titulos) {
            System.out.println(titulo.getNome());

            if (titulo instanceof Filme) {
                Filme filme = (Filme) titulo;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

    }


}
