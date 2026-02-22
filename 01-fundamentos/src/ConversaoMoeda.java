// Objetivo do exercício: Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

public class ConversaoMoeda {
    public static void main(String[] args) {

        // Entrada
        double valorEmDolares = 20;

        // Processamento
        double taxaConversao = 4.94;
        double conversaoDolarReal = valorEmDolares * taxaConversao;

        // Saida

        System.out.printf("Quantia em Dolar: US$ %.2f | Cotação do Dolar: R$ %.2f | Valor convertido: R$ %.2f%n", valorEmDolares,taxaConversao, conversaoDolarReal);
    }
}
