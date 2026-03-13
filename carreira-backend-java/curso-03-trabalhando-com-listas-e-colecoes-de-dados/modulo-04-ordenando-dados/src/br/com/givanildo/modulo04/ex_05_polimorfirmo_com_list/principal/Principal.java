package br.com.givanildo.modulo04.ex_05_polimorfirmo_com_list.principal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<String> lista;

        lista = new ArrayList<>();

        lista.add("Um");
        lista.add("Dois");
        lista.add("Três");

        System.out.println("Lista com ArrayList");
        System.out.println(lista);


        lista = new LinkedList<>();
        lista.add("Quatro");
        lista.add("Cinco");
        lista.add("Seis");

        System.out.println("Lista com LinkedList");
        System.out.println(lista);
    }

}
