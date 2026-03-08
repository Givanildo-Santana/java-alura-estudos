package br.com.givanildo.modulo03.desafios.ex04_numerosPrimos.principal;

import br.com.givanildo.modulo03.desafios.ex04_numerosPrimos.model.NumerosPrimos;

import br.com.givanildo.modulo03.desafios.ex04_numerosPrimos.model.GeradorPrimo;
import br.com.givanildo.modulo03.desafios.ex04_numerosPrimos.model.VerificadorPrimo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura =  new Scanner(System.in);

        System.out.print("Informe qual classe deseja usar [1] para NumerosPrimos [2] para VerificarPrimo e [3] para GeradorPrimo:");
        int opcao = leitura.nextInt();
        leitura.nextLine();
        System.out.println(" ");

        int numero = 0;

        if (opcao == 1) {
            // Testando a classe NumerosPrimos
            NumerosPrimos numerosPrimos = new NumerosPrimos();
            System.out.print("Informe um número para verificar se ele é primo: ");
            numero = leitura.nextInt();
            leitura.nextLine();
            System.out.printf("Número informado: %d é primo? : %b\n", numero, numerosPrimos.verificarPrimalidade(numero));
            System.out.println(" ");

            System.out.print("Informe um número limite para ver a lista dos números primos até ele: ");
            numero = leitura.nextInt();
            leitura.nextLine();
            System.out.printf("Número informado: %d \n", numero);
            System.out.print("Lista dos números primos até o número informado: ");
            numerosPrimos.listarPrimos(numero);
        }
        if (opcao == 2) {
            // Testando a classe VerificadorPrimo

            VerificadorPrimo verificadorPrimo = new VerificadorPrimo();

            System.out.print("Informe um número para ver se é primo: ");
            numero = leitura.nextInt();
            leitura.nextLine();
            System.out.println(verificadorPrimo.verificarSeEhPrimo(numero));


        }

        if (opcao == 3){
            // Testando a classe GeradorPrimo

            GeradorPrimo geradorPrimo = new GeradorPrimo();

            System.out.print("informe um número para ver o proximo primo após ele: ");
            numero = leitura.nextInt();
            leitura.nextLine();
            geradorPrimo.gerarProximoPrimo(numero);

        }
    }
}
