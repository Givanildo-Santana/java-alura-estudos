// Objetivo do exercício: Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
package br.com.givanildo.alura.fundamentos;
public class CalculoTotal {
    public static void main(String[] args) {

        // Entrada
        double precoProduto = 5.99;
        int quantidade = 3;

        // Processamento
        double valorTotal = precoProduto * quantidade;

        // Saída
        System.out.printf("Preço: %.2f | Quantidade: %d | Total: %.2f%n", precoProduto, quantidade, valorTotal);
    }
}
