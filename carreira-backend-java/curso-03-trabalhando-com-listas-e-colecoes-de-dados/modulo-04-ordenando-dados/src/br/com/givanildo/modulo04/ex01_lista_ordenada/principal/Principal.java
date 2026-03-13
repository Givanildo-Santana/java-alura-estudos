package br.com.givanildo.modulo04.ex01_lista_ordenada.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(11);
        lista.add(2);
        lista.add(71);
        lista.add(22);
        lista.add(7);
        lista.add(3);

        System.out.println("Lista original");
        System.out.println(lista);
        System.out.println(" ");

        System.out.println("Lista ordenada");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
