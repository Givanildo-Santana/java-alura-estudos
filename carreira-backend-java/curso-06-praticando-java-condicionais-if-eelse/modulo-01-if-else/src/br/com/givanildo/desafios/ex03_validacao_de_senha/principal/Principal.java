package br.com.givanildo.desafios.ex03_validacao_de_senha.principal;

import java.util.Scanner;


public class Principal {
        public static void main(String[] args) {
            String senhaCorreta = "123456";
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a senha: ");
            String tentativaSenha = scanner.nextLine();

            scanner.close();

            if (tentativaSenha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Acesso negado!");
            }
        }
    }