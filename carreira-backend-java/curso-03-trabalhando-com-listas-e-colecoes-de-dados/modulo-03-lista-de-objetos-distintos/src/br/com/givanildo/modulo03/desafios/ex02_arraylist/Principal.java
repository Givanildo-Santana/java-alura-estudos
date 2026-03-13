package br.com.givanildo.modulo03.desafios.ex02_arraylist;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        for (String palavra : lista) {
            System.out.println(palavra);
        }
    }
}
