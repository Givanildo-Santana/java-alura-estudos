package br.com.givanildo.modulo04.desafios.ex04_ConversorTemperatura.principal;

import br.com.givanildo.modulo04.desafios.ex04_ConversorTemperatura.model.ConversorTemperaturaPadrao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new  Scanner(System.in);
        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();

        System.out.println("Entre com o valor da temperatura em Celsius para ver ela convertida em Fahrenheit");
        System.out.print("Celsius: ");
        double temperaturaEmCelsius = leitura.nextDouble();
        leitura.nextLine();
        System.out.printf("Temperatura em Celsius: %.2f°C convertida em Fahrenheit: %.2f°F", temperaturaEmCelsius,conversorTemperatura.celsiusParaFahrenheit(temperaturaEmCelsius));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Entre com o valor da temperatura em Fahrenheit para ver ela convertida em Celsius");
        System.out.print("Fahrenheit: ");
        double temperaturaEmFahrenheit = leitura.nextDouble();
        leitura.nextLine();
        System.out.println(" ");
        System.out.printf("Temperatura em Fahrenheit: %.2f°C convertida em Celsius: %.2f°C", temperaturaEmFahrenheit,conversorTemperatura.fahrenheitParaCelsius(temperaturaEmFahrenheit));



        leitura.close();
    }
}
