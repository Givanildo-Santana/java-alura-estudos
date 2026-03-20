package br.com.givanildo.modulo01.desafios.ex02_api_coigecko.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiCoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.print("Informe o nome da criptomoeda para ver a sua cotação: ");
        String criptomoeda = leitura.nextLine();
        String chaveApi = System.getenv("COINGECKO_API_KEY");
        String caminho = String.format("https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids=%s&x_cg_demo_api_key=%s",criptomoeda,chaveApi);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(caminho)).build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        leitura.close();
    }
}
