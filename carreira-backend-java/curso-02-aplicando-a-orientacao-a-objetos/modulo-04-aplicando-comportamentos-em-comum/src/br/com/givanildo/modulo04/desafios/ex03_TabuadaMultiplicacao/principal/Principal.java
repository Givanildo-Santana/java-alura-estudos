package br.com.givanildo.modulo04.desafios.ex03_TabuadaMultiplicacao.principal;

import br.com.givanildo.modulo04.desafios.ex03_TabuadaMultiplicacao.model.TabuadaMultiplicacao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();

        System.out.print("Entre com um numero de 1 a 10 para ver a sua tabuada: ");
        int numero = leitura.nextInt();
        leitura.nextLine();

        tabuada.exibirTabuada(numero);



        leitura.close();
    }
}
