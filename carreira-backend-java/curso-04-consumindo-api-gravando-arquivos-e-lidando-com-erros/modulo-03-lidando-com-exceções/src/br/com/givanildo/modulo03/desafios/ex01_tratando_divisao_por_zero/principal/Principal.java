package br.com.givanildo.modulo03.desafios.ex01_tratando_divisao_por_zero.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        try {
            System.out.printf("\n%s Calculadora de divisão %s\n\n","*".repeat(20), "*".repeat(20));
            System.out.print("Informe o numero que será dividido: ");
            int divedendo = leitura.nextInt();
            leitura.nextLine();
            System.out.print("Informe o divisor: ");
            int divisor = leitura.nextInt();
            leitura.nextLine();
            System.out.printf("%d / %d = %d\n\n",divedendo, divisor, divedendo/divisor);
            System.out.printf("%s\n\n","*".repeat(30));
            leitura.close();
        }catch (ArithmeticException e){
            leitura.close();
            System.out.println("\nInforme um numero valido como divisor!");
        }
        finally {
            leitura.close();
            System.out.println("O programa finalizou corretamente!");
        }


    }
}
