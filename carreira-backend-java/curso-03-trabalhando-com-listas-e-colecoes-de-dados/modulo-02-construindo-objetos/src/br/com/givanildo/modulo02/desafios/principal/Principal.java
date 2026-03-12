package br.com.givanildo.modulo02.desafios.principal;

import br.com.givanildo.modulo02.desafios.model.Produto;
import br.com.givanildo.modulo02.desafios.model.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> listaDeCompras = new ArrayList<>();
        Produto produto1 = new Produto("Café", 10.50, 2);
        Produto produto2 = new Produto("Açucar", 5.20, 3);
        ProdutoPerecivel produto3 = new ProdutoPerecivel("Bife",30.99, 2, "15/04/2026");


        listaDeCompras.add(produto1);
        listaDeCompras.add(produto2);
        listaDeCompras.add(produto3);

        System.out.println("Número de Cada item: " + listaDeCompras.size());
        System.out.println("Primeiro item da lista: " + listaDeCompras.get(0).getNome());

        for (Produto item : listaDeCompras) {
            System.out.println(item);
        }



    }
}
