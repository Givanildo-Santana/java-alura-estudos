package br.com.givanildo.modulo04.desafios.ex02_CalculadoraSalaRetangular.principal;

import br.com.givanildo.modulo04.desafios.ex02_CalculadoraSalaRetangular.model.CalculadoraSalaRetangular;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        CalculadoraSalaRetangular calculadoraSala = new CalculadoraSalaRetangular();

        System.out.println("Entre com valores para saber a área e o perímetro da Sala");
        System.out.print("Altura: ");
        double altura = leitura.nextDouble();
        leitura.nextLine();

        System.out.print("Largura: ");
        double largura = leitura.nextDouble();
        leitura.nextLine();
        System.out.println(" ");

        System.out.printf("|Dados da Sala| Área: %.2fm² Perimetro: %.2fm²",calculadoraSala.calcularArea(altura,largura), calculadoraSala.calcularPerimetro(altura,largura) );



        leitura.close();
    }
}
