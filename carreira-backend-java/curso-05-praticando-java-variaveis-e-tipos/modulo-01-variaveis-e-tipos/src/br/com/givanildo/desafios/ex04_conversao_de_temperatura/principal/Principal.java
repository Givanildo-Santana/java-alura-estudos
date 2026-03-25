package br.com.givanildo.desafios.ex04_conversao_de_temperatura.principal;

public class Principal {
        public static void main(String[] args) {
            int celsius = 32;

            double fahrenheit = (celsius * 9 / 5.0) + 32;

            System.out.print("A temperatura em graus Fahrenheit é: " + fahrenheit);
        }
}
