// Objetivo do exercício: Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Entrada

        System.out.print("Informe um numero inteiro para verificar se ele é par ou ímpar: ");
        int numeroInformado = leitura.nextInt();

        // Processamento e Saída
        if(numeroInformado % 2 == 0){
            System.out.printf("O numero %d é um número par%n", numeroInformado);
        }else {
            System.out.printf("O numero %d é um número ímpar%n", numeroInformado);
        }

        leitura.close();
    }
}
