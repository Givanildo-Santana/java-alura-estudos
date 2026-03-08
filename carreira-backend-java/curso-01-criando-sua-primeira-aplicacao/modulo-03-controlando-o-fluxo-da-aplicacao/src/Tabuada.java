// Objetivo do exercício: Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Entrada
        System.out.println("Informe um número de 1 a 10 para ver a sua tabuada");
        System.out.print("informado o número: ");
        int numeroInformado = leitura.nextInt();

        // Processamento e Saída
        if (numeroInformado > 0 && numeroInformado <=10){
            int contador = 1;
            System.out.printf("Tabuada do número %d%n", numeroInformado);
            System.out.println(" ");

            System.out.println("Soma");
            while (contador <= 10){
                int soma =  numeroInformado + contador;
                System.out.printf("%d + %d = %d%n", numeroInformado, contador, soma);
                contador++;
            }

            System.out.println(" ");
            contador =1;
            System.out.println("Subtração");
            while (contador <= 10){
                int subtracao = numeroInformado - contador;
                System.out.printf("%d - %d = %d%n", numeroInformado, contador, subtracao);
                contador++;
            }

            System.out.println(" ");
            contador =1;
            System.out.println("Multiplicação");
            while (contador <= 10){
                int multiplicacao = numeroInformado * contador;
                System.out.printf("%d x %d = %d%n", numeroInformado, contador, multiplicacao);
                contador++;
            }

            System.out.println(" ");
            contador =1;
            System.out.println("Divisão");
            while (contador <= 10){
                double divisao = (double) numeroInformado / contador;
                System.out.printf("%d ÷ %d = %.2f%n", numeroInformado, contador, divisao);
                contador++;
            }

        }else {
            System.out.println("Número invalido!");
        }

        leitura.close();
    }
}
