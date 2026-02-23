// Objetivo do exercício: Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
import java.util.Scanner;
public class MenuAreas {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Entrada
        System.out.print("Digite '1' para calcular a área do quadrado ou '2' para calcular a área do círculo: ");
        int opcaoSelecionada = leitura.nextInt();

        // Processamento
        if (opcaoSelecionada == 1){
            System.out.println("Opção selecionada: área do quadrado");
            System.out.print("Informe o valor do lado: ");
            double valorLado= leitura.nextDouble();
            double areaQuadrado = valorLado * valorLado;
            System.out.println(" ");
            System.out.printf("Área do Quadrado: %.2f m²%n", areaQuadrado);

        }else if(opcaoSelecionada == 2){
            System.out.println("Opção selecionada: área do círculo");
            System.out.print("Informe o raio do círculo: ");
            double raioCirculo = leitura.nextDouble();
            double areaCirculo = Math.PI * raioCirculo*raioCirculo;
            System.out.println(" ");
            System.out.printf("Área do círculo: %.2f m²%n", areaCirculo);
        }else {
            System.out.println("Opção selecionada é invalida");
        }


        leitura.close();
    }
}
