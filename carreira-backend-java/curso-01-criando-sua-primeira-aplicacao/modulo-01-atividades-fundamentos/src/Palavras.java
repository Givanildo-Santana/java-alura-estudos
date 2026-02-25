// Objetivo do exercício: Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

public class Palavras {
    public static void main(String[] args) {

        // Entrada
        String palavra = "Alan";
        char caractere = 'A';

        // Processamento
        String mensagem = String.format("A palavra informada é \"%s\" e o caracter é '%c'",palavra, caractere);

        // Saída
        System.out.println(mensagem);
    }
}
