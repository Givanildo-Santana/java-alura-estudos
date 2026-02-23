// Objetivo do exercício: Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
package br.com.givanildo.alura.condicionais;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Entrada
        System.out.print("Informe um número inteiro para ver o seu fatorial: ");
        int numeroInformado = leitura.nextInt();

        // Processamento e Saída
        if (numeroInformado < 0){
            System.out.println("Não existe fatorial negativo");
        }else if (numeroInformado == 0) {
            System.out.println("0! é igual a 1");
        } else {
            long fatorial = numeroInformado;
            for (int i = numeroInformado-1; i > 0 ; i--) {
                fatorial *= i;
            }
            System.out.printf("%d! = %d%n", numeroInformado,fatorial);
        }
        leitura.close();
    }
}
