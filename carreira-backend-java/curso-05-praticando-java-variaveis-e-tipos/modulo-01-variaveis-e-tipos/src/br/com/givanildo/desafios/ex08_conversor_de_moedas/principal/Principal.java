package br.com.givanildo.desafios.ex08_conversor_de_moedas.principal;

public class Principal {

        public static void main(String[] args) {

            double valorReais = 302.55;
            double taxaCambio = 5.25;

            double valorDolares = valorReais / taxaCambio;

            System.out.println("O valor em dólares é: US$ " + valorDolares);
        }
    }