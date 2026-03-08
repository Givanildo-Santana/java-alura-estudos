package br.com.givanildo.modulo04.desafios.CalculadorTaxa.principal;

import br.com.givanildo.modulo04.desafios.CalculadorTaxa.model.Livro;
import br.com.givanildo.modulo04.desafios.CalculadorTaxa.model.ProdutoFisico;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();


        System.out.print("Informe com qual classe deseja interagir [1] para Livro [2] para ProdutoFisico: ");
        int opcao = leitura.nextInt();
        leitura.nextLine();
        System.out.println(" ");

        if (opcao == 1){
            System.out.print("Informe o nome do livro: ");
            livro.setNome(leitura.nextLine());
            System.out.print("Informe o preço do livro: ");
            livro.setPreco(leitura.nextDouble());
            leitura.nextLine();
            System.out.print("Informe o percentual de Desconto: ");
            livro.setDesconto(leitura.nextDouble());
            leitura.nextLine();
            System.out.println(" ");
            System.out.printf("| Informações do Produto |\n Nome do produto: %s\n Preço: R$ %.2f\n Desconto: %.2f%%\n Preço Final: R$ %.2f",livro.getNome(), livro.getPreco(),livro.getDesconto(), livro.calcularPrecoFinal() );

        }
        if (opcao == 2){
            System.out.print("Informe o nome do serviço: ");
            produtoFisico.setNome(leitura.nextLine());
            System.out.print("Informe o preço do serviço: ");
            produtoFisico.setPreco(leitura.nextDouble());
            leitura.nextLine();
            System.out.print("Informe o percentual da taxa sobre o serviço: ");
            produtoFisico.setTaxa(leitura.nextDouble());
            leitura.nextLine();
            System.out.println(" ");
            System.out.printf("| Informações do Serviço |\n Nome do Serviço: %s\n Preço: R$ %.2f\n Taxa: %.2f%%\n Preço Final: R$ %.2f",produtoFisico.getNome(), produtoFisico.getPreco(), produtoFisico.getTaxa(), produtoFisico.calcularPrecoFinal());

        }

        leitura.close();
    }
}
