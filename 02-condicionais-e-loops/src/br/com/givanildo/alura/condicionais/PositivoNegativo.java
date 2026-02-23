// Objetivo do exercício: Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
package br.com.givanildo.alura.condicionais;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Entrada
        System.out.print("Digite um numero para verificar se ele é positivo ou negativo:");
        double numeroDigitado = leitura.nextDouble();
        // Processamento e Saída
        if (numeroDigitado < 0){
            System.out.println("O número negativo");
        }
        else if(numeroDigitado > 0){
            System.out.println("O número positivo");
        }else {
            System.out.println("O número zero é um número neutro");
        }

        leitura.close();

    }
}