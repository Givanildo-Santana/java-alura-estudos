package br.com.givanildo.desafios.ex02_verificando_aprovacao_em_uma_disciplina.principal;

public class Principal {
        public static void main(String[] args) {
            double media = 5.8;

            if (media >= 7.0) {
                System.out.println("O aluno teve média " + media + " e foi aprovado.");
            } else if (media >= 5.0) {
                System.out.println("O aluno teve média " + media + " e está de recuperação.");
            } else {
                System.out.println("O aluno teve média " + media + " e foi reprovado.");
            }
        }
    }
