// Objetivo do exercício: Crie um programa que realize a média de duas notas decimais e exiba o resultado.
package br.com.givanildo.alura.fundamentos;
public class Media {
    public static void main(String[] args) {

        // Entrada
        double nota1 = 7;
        double nota2 = 5;

       // Processamento
        double media = (nota1 + nota2)/ 2;

        // Saída
        System.out.printf("A média das notas é %.2f", media);

    }
}
