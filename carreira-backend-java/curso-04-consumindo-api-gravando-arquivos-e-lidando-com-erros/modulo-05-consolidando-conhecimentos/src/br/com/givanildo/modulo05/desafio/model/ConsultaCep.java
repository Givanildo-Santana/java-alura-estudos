package br.com.givanildo.modulo05.desafio.model;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep{

    public Endereco consultarEndereco(String cep) {
        String url = String.format("https://viacep.com.br/ws/%s/json/",cep);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        }
        catch (IOException | InterruptedException e){
            throw new RuntimeException("Não conseguir obter esse endereço");
        }
        catch (IllegalStateException | JsonSyntaxException e){
            throw new RuntimeException("Cep inserido é invalido verifique!");
        }

    }
}


