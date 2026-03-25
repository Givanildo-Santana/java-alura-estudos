package br.com.givanildo.modulo01.desafios.ex03_api_themealbd.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiTheMealDB {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe o nome da receita (em inglês): ");
        String busca = leitura.nextLine().replace(" ", "+");
        String caminho = String.format("https://www.themealdb.com/api/json/v1/1/search.php?s=%s", busca);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(caminho)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


        leitura.close();

    }
}
