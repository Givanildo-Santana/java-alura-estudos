package br.com.givanildo.modulo04.ex03_implementando_collections.principal;
import br.com.givanildo.modulo04.ex02_titulo_comparable.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Titulo> filmesDeTerror = new ArrayList<>();


        Titulo terror1 = new Titulo("Chucky");
        Titulo terror2 = new Titulo("Invocação do mal");
        Titulo terror3 = new Titulo("It: A coisa");

        filmesDeTerror.add(terror1);
        filmesDeTerror.add(terror2);
        filmesDeTerror.add(terror3);

        System.out.println("Lista original de filmes ");
        System.out.println(filmesDeTerror);
        System.out.println(" ");

        System.out.println("Lista ordenada de filmes ");
        Collections.sort(filmesDeTerror);
        System.out.println(filmesDeTerror);
    }
}
