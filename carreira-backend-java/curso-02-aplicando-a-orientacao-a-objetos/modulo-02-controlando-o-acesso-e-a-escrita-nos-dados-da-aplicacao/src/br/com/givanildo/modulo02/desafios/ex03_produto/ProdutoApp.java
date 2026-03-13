package br.com.givanildo.modulo02.desafios.ex03_produto;

public class ProdutoApp {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Maçã");
        produto.setPreco(5.50);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.printf("Preço original do produto R$ %.2f\n", produto.getPreco());
        produto.aplicarDesconto(15);
        System.out.printf("Preço com desconto de 15%%: R$ %.2f\n", produto.getPreco());
    }
}
