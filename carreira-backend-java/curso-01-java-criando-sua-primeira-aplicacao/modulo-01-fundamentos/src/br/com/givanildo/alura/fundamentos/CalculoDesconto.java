// Objetivo do exercício: Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
package br.com.givanildo.alura.fundamentos;
public class CalculoDesconto {
    public static void main(String[] args) {

        // Entrada
        double precoOriginal = 100;
        double percentualDesconto = 15;

        // Processamento
        double valorDesconto = precoOriginal * (percentualDesconto/100);
        double precoFinal = precoOriginal - valorDesconto;

        // Saída
        System.out.printf("Preço original: R$ %.2f | Desconto %.2f%% (R$ %.2f) | Preço final R$ %.2f%n", precoOriginal, percentualDesconto, valorDesconto, precoFinal);
    }
}
