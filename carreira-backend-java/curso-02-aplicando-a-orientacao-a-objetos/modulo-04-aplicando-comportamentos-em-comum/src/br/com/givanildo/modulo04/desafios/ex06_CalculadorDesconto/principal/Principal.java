package br.com.givanildo.modulo04.desafios.ex06_CalculadorDesconto.principal;

import br.com.givanildo.modulo04.desafios.ex06_CalculadorDesconto.model.Produto;
import br.com.givanildo.modulo04.desafios.ex06_CalculadorDesconto.model.Servico;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Produto produto = new Produto();
        Servico servico = new Servico();


        System.out.print("Informe com qual classe deseja interagir [1] para Produto [2] para Serviço: ");
        int opcao = leitura.nextInt();
        leitura.nextLine();
        System.out.println(" ");

        if (opcao == 1){
            System.out.print("Informe o nome do Produto: ");
            produto.setNome(leitura.nextLine());
            System.out.print("Informe o preço do Produto: ");
            produto.setPreco(leitura.nextDouble());
            leitura.nextLine();
            System.out.print("Informe a quantidade comprada: ");
            produto.setQuantidade(leitura.nextInt());
            leitura.nextLine();
            System.out.println(" ");
            System.out.printf("| Informações do Produto |\n Nome do produto: %s\n Preço: R$ %.2f\n Quantidade: %d\n Preço Final: R$ %.2f",produto.getNome(), produto.getPreco(),produto.getQuantidade(), produto.calcularPrecoTotal(produto.getQuantidade()));

        }
        if (opcao == 2){
            System.out.print("Informe o nome do serviço: ");
            servico.setNome(leitura.nextLine());
            System.out.print("Informe o preço do serviço: ");
            servico.setPreco(leitura.nextDouble());
            leitura.nextLine();
            System.out.print("Informe a quantidade de vezes que o cliente contratou nossos serviços: ");
            servico.setQuantidade(leitura.nextInt());
            leitura.nextLine();
            System.out.println(" ");
            System.out.printf("| Informações do Serviço |\n Nome do Serviço: %s\n Preço: R$ %.2f\n Quantidade: %d vezes\n Preço Final: R$ %.2f",servico.getNome(), servico.getPreco(), servico.getQuantidade(), servico.calcularPrecoTotal(servico.getQuantidade()));

        }

        leitura.close();
    }
}
