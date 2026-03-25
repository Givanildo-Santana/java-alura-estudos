package br.com.givanildo.desafios.ex07_verificando_se_um_numero_esta_em_um_intervalo.principal;

import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor do empréstimo: ");
            int valor = scanner.nextInt();

            if (valor >= 1000 && valor <= 5000) {
                System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo.");
            } else {
                System.out.println("O valor " + valor + " não está dentro do intervalo permitido para empréstimo.");
            }
            scanner.close();
        }
    }