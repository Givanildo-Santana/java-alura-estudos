package br.com.givanildo.modulo02.desafios.ex04_aluno;

public class AlunoApp {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Victor Araujo");
        aluno.setNota1(7);
        aluno.setNota2(6.5);
        aluno.setNota3(8.5);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.printf("Nota do 1° trimestre: %.2f\n", aluno.getNota1());
        System.out.printf("Nota do 2° trimestre: %.2f\n", aluno.getNota2());
        System.out.printf("Nota do 3° trimestre: %.2f\n", aluno.getNota3());
        System.out.printf("Média das Notas: %.2f ", aluno.calcularMedia());

    }
}
