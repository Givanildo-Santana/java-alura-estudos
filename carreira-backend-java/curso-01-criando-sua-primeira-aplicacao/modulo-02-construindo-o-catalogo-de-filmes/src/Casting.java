// Objetivo do exercício: Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

public class Casting {
    public static void main(String[] args) {

    // Entrada
        double variavelDouble = 7.5;

    // Processamento
        int variavelCasting = (int) variavelDouble;

    // Saída
        System.out.printf("Casting: %.2f (double) virou %d (int)%n", variavelDouble,variavelCasting);
    }

}