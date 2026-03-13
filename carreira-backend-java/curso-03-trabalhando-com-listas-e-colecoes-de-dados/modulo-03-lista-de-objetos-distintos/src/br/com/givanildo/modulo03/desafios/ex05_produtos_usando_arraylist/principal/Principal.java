package br.com.givanildo.modulo03.desafios.ex05_produtos_usando_arraylist.principal;

import br.com.givanildo.modulo03.desafios.ex05_produtos_usando_arraylist.model.Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sorvete", 10);
        Produto produto2 = new Produto("Açaí", 15.50);
        Produto produto3 = new Produto("Milkshake", 12.35);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        double precoTotal = 0;

        for (Produto item: listaDeProdutos){
            precoTotal += item.getPreco();
        }
        double precoMedio = precoTotal / listaDeProdutos.size();

        System.out.printf("Preço médio dos itens da lista:R$ %.2f", precoMedio);
    }
}
