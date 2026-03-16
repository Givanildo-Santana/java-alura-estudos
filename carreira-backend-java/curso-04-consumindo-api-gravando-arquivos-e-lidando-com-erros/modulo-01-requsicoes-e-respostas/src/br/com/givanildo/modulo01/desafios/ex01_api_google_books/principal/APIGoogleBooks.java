package br.com.givanildo.modulo01.desafios.ex01_api_google_books.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe o nome do livro: ");
        String busca = leitura.nextLine().replace(" ", "+");
        String chaveApi = System.getenv("GOOGLE_BOOKS_API_KEY");
        String caminho = String.format("https://www.googleapis.com/books/v1/volumes?q=%s&key=%s",busca, chaveApi);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(caminho)).build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        leitura.close();
    }
}
