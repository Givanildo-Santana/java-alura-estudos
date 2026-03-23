package br.com.givanildo.modulo04.desafios.ex01_escrevendo_em_um_arquivo_txt.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        FileWriter escrita = new FileWriter("arquivo.txt");

        String mensagem = "Conteúdo a ser gravado no arquivo.";

        escrita.write(mensagem);

        escrita.close();
        leitura.close();
    }
}
