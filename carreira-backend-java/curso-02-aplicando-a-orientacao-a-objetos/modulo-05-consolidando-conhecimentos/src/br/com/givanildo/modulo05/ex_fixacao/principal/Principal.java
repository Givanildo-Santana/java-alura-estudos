package br.com.givanildo.modulo05.ex.principal;

import br.com.givanildo.modulo05.ex.model.Musica;
import br.com.givanildo.modulo05.ex.model.Podcast;
import br.com.givanildo.modulo05.ex.model.Preferidas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Musica musica = new Musica();
        Podcast podcast = new Podcast();
        Preferidas preferidas = new Preferidas();

        System.out.print("Com que tipo de Audio você deseja interagir? [1] para música [2] para podcast: ");
        int opcao = leitura.nextInt();
        leitura.nextLine();

        if (opcao == 1){
            System.out.print("Informe o titulo da musica: ");
            musica.setTitulo(leitura.nextLine());
            System.out.print("Informe o Artista: ");
            musica.setArtista(leitura.nextLine());

            for (int i = 0; i < 1000; i++) {
                musica.reproduzir();

                if (i <= 50){
                    musica.curtir();
                }
            }
            preferidas.inclui(musica);
        }

        if (opcao == 2){
            System.out.print("Informe o titulo do Podcast: ");
            podcast.setTitulo(leitura.nextLine());
            System.out.print("Informe o nome do apresentador: ");
            podcast.setApresentador(leitura.nextLine());

            for (int i = 0; i < 5000; i++) {
                podcast.reproduzir();

                if (i <= 1000){
                    podcast.curtir();
                }
            }
            preferidas.inclui(podcast);
        }

         leitura.close();
    }
}
