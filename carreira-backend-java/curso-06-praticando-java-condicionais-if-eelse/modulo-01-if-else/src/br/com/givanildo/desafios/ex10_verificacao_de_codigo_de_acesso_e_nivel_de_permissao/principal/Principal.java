package br.com.givanildo.desafios.ex10_verificacao_de_codigo_de_acesso_e_nivel_de_permissao.principal;

import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int codigoCorreto = 2021;
            int nivelPermissaoMinimo = 2;
            int nivelPermissaoMaximo = 3;

            System.out.print("Digite o código de acesso: ");
            int codigoDigitado = scanner.nextInt();

            System.out.print("Digite o nível de permissão: ");
            int nivelPermissao = scanner.nextInt();

            boolean codigoValido = codigoDigitado == codigoCorreto;
            boolean permissaoValida = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo;

            if (codigoValido && permissaoValida) {
                System.out.println("Acesso permitido. Bem-vindo ao sistema!");
            } else {
                System.out.println("Acesso negado. Motivo(s):");
                if (!codigoValido) {
                    System.out.println("- Código de acesso incorreto.");
                }
                if (!permissaoValida) {
                    System.out.println("- Nível de permissão inválido.");
                }
            }
        }
    }
