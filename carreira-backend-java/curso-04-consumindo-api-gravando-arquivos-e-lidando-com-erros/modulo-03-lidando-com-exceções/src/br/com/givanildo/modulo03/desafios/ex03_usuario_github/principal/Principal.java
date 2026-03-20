package br.com.givanildo.modulo03.desafios.ex03_usuario_github.principal;

import br.com.givanildo.modulo03.desafios.ex03_usuario_github.excecao.ErroConsultaGitHubException;
import br.com.givanildo.modulo03.desafios.ex03_usuario_github.model.UsuarioGitHub;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        try {
            System.out.printf("%s Consulta Usuario GitHub %s\n\n","*".repeat(10), "*".repeat(10));
            System.out.print("Informe o nome do Usuario: ");
            String busca = leitura.nextLine().replace(" ", "-");
            String caminho =  String.format("https://api.github.com/users/%s",busca);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(caminho)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new Gson();
            UsuarioGitHub usuarioGitHub = gson.fromJson(json, UsuarioGitHub.class);

            verificarUsuario(usuarioGitHub);

            System.out.println(usuarioGitHub);

        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
            System.out.println("Verifique o que foi digitado e tente novamente!\n");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        finally {
            System.out.println("\nO programa finalizou corretamente!");
        }

        leitura.close();
    }

    public static void verificarUsuario(UsuarioGitHub usuarioGitHub){
        if (usuarioGitHub.login() == null){
            throw new ErroConsultaGitHubException("\nUsuário não encontrado!");

        }
    }
}
