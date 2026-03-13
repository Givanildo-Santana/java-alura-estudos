package br.com.givanildo.modulo04.ex04_list_arraylist_linkedlist.principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Um");
        lista.add("Dois");
        lista.add("Três");

        System.out.println("Lista com ArrayList");
        System.out.println(lista);

        System.out.println(" ");

        List<String> lista1 = new LinkedList<>();

        lista1.add("Quatro");
        lista1.add("Cinco");
        lista1.add("Seis");

        System.out.println("Lista com LinkedList");
        System.out.println(lista1);

    }

}
