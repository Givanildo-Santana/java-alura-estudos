package br.com.givanildo.alura.desafios.contabancaria;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Entrada
        String nomeCliente = "Jaqueline Oliveira";
        String tipoConta = "Corrente";
        double saldoInicial = 2500;
        double saldoConta = saldoInicial;
        boolean continuar = true;

        System.out.println("*".repeat(50));
        System.out.println("Dados inicias do cliente:");
        System.out.println(" ");
        System.out.printf("Nome:            %s%n",nomeCliente);
        System.out.printf("Tipo conta:      %s%n",tipoConta);
        System.out.printf("Saldo inicial:   R$ %.2f%n", saldoInicial);
        System.out.println("*".repeat(50));


        while (continuar) {
            System.out.println(" ");

            System.out.println("Operações");
            System.out.println(" ");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println(" ");
            System.out.println("*".repeat(50));

            System.out.println(" ");

            System.out.print("Digite a opção desejada: ");
            int opcaoSelecionada = leitura.nextInt();
            System.out.println(" ");

            if (opcaoSelecionada == 1) {
                System.out.println("Opção selecionada '1' Consulta de saldo");
                System.out.println(" ");
                System.out.println("*".repeat(30));
                System.out.printf("O saldo Atual é R$ %.2f%n", saldoConta);
                System.out.println("*".repeat(30));
            } else if (opcaoSelecionada == 2) {
                System.out.println("Opção selecionada '2' Deposito");
                System.out.println(" ");
                System.out.print("Informe o valor do deposito: ");
                double valorDeposito = leitura.nextDouble();
                System.out.println(" ");
                if (valorDeposito <= 0) {
                    System.out.println("*".repeat(30));
                    System.out.println("Valor invalido");
                    System.out.println("*".repeat(30));
                } else {
                    saldoConta += valorDeposito;
                    System.out.println("*".repeat(40));
                    System.out.printf("Saldo após o depósito: R$ %.2f%n", saldoConta);
                    System.out.println("*".repeat(40));
                    System.out.println(" ");
                }

            } else if (opcaoSelecionada == 3) {
                System.out.println("Opção selecionada '3' Transferência");
                System.out.println(" ");
                System.out.print("Informe o valor a ser transferido: ");
                double valorTransferido = leitura.nextDouble();
                leitura.nextLine();
                System.out.println(" ");

                if (valorTransferido <= 0) {
                    System.out.println("*".repeat(30));
                    System.out.println("Valor invalido!");
                    System.out.println("*".repeat(30));
                } else if (valorTransferido > saldoConta) {
                    System.out.println("*".repeat(100));
                    System.out.println("Não é possível realizar essa operação saldo na conta é menor que o valor a ser transferido");
                    System.out.println("*".repeat(100));
                }
                else {
                    saldoConta -= valorTransferido;
                    System.out.println("*".repeat(40));
                    System.out.printf("Saldo após a transferencia R$ %.2f%n",saldoConta);
                    System.out.println("*".repeat(40));
                }
            } else if (opcaoSelecionada == 4) {
                System.out.println("Saíndo do Programa!");
                continuar = false;
                break;
            }
            else {
                System.out.println("Opção Invalida!");
            }
        }

        leitura.close();
    }
}

