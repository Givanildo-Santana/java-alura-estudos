package br.com.givanildo.modulo04.desafios.ex01_conversorMoeda.principal;

import br.com.givanildo.modulo04.desafios.ex01_conversorMoeda.model.ConversorMoeda;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConversorMoeda conversor = new ConversorMoeda();

        System.out.print("Entre com o valor em dolar para saber o valor convertido: ");
        double numero = leitura.nextInt();
        leitura.nextLine();

        System.out.printf("O valor US$ %.2f convertido em Reais é R$ %.2f\n", numero, conversor.converterDolarParaReal(numero));

        leitura.close();
    }





}
