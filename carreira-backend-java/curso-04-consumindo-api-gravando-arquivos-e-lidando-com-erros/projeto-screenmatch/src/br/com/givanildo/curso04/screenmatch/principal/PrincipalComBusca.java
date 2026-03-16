package br.com.givanildo.curso04.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.print("Informe o nome do filme:");
        String busca = leitura.nextLine();
        String chaveapi = System.getenv("OMDB_API_KEY");
        String caminho = String.format("http://www.omdbapi.com/?t=%s&apikey=%s",busca,chaveapi);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(caminho)).build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


        leitura.close();
    }
}
