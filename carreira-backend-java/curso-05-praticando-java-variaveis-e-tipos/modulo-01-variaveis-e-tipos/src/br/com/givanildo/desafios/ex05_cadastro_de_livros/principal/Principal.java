package br.com.givanildo.desafios.ex05_cadastro_de_livros.principal;

public class Principal {
        public static void main(String[] args) {

            String titulo = "Harry Potter";
            String autor = " J.K. Rowling";
            int paginas = 644;
            double preco = 65.11;
            char categoria = 'F';

            String categoriaDescricao;

            if (categoria == 'F') {
                categoriaDescricao = "Ficção";
            } else if (categoria == 'N') {
                categoriaDescricao = "Não-ficção";
            } else if (categoria == 'T') {
                categoriaDescricao = "Tecnologia";
            } else if (categoria == 'H') {
                categoriaDescricao = "História";
            } else {
                categoriaDescricao = "Categoria inválida";
            }

            System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");
        }
}
