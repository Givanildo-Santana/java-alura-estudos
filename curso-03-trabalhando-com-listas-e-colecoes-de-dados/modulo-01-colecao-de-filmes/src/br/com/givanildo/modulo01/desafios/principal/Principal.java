package br.com.givanildo.modulo01.desafios.principal;

import br.com.givanildo.modulo01.desafios.model.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Alan");
        pessoa1.setIdade(23);

        pessoa2.setNome("Alice");
        pessoa2.setIdade(15);

        pessoa3.setNome("Marcos");
        pessoa3.setIdade(13);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Numero de pessoas na lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista de pessoas" + listaDePessoas);
    }





}
