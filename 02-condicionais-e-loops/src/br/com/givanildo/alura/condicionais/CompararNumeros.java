// Objetivo do exercício: Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
package br.com.givanildo.alura.condicionais;
import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Entrada
        System.out.println("Digite dois números inteiros para compara-los");
        System.out.print("Digite o primeiro: ");
        int valor1 = leitura.nextInt();
        System.out.print("Digite o Segundo: ");
        int valor2 = leitura.nextInt();

        // Processamento e Saída
        if (valor1 == valor2){
            System.out.println("Os valores são iguais!");

        } else if (valor1 > valor2) {
            System.out.println("Os valores são diferentes e o primeiro valor é maior que o segundo");
        }else {
            System.out.println("Os valores são diferentes e o segundo valor é maior que o primeiro");
        }



        leitura.close();
    }
}
