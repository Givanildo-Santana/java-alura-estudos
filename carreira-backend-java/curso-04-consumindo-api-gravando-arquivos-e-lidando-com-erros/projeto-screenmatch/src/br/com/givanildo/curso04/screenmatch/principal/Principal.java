    package br.com.givanildo.curso04.screenmatch.principal;

    import br.com.givanildo.curso04.screenmatch.excecao.ErroDeConversaoDeAnoException;
    import br.com.givanildo.curso04.screenmatch.model.Titulo;
    import br.com.givanildo.curso04.screenmatch.model.TituloOMDb;
    import com.google.gson.FieldNamingPolicy;
    import com.google.gson.Gson;
    import com.google.gson.GsonBuilder;

    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpRequest;
    import java.net.http.HttpResponse;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Principal {
        public static void main(String[] args) throws IOException {
            String chaveapi = System.getenv("OMDB_API_KEY");

            Scanner leitura = new Scanner(System.in);
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
            List<Titulo> titulos = new ArrayList<>();

            while (true) {
                System.out.print("Informe o nome do filme ou [SAIR] para finalizar: ");
                String busca = leitura.nextLine().replace(" ", "+");

                if (busca.equalsIgnoreCase("SAIR")) {
                    System.out.println(titulos);
                    FileWriter escrita = new FileWriter("filmes.json");
                    escrita.write(gson.toJson(titulos));
                    escrita.close();
                    System.out.println("\nFinalizando o programa! ");
                    break;
                } else {
                    try {
                        String caminho = String.format("http://www.omdbapi.com/?t=%s&apikey=%s", busca, chaveapi);
                        HttpClient cliente = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder(URI.create(caminho)).build();
                        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
                        String json = response.body();

                        TituloOMDb tituloOMDb = gson.fromJson(json, TituloOMDb.class);
                        Titulo titulo = new Titulo(tituloOMDb);

                        titulos.add(titulo);

                        System.out.printf("\n%s Informações do titulo %s\n", "*".repeat(10), "*".repeat(10));
                        System.out.println(titulo);
                        System.out.printf("*".repeat(43));
                        System.out.println(" ");
                        System.out.println(" ");
                    } catch (IOException e) {
                        System.out.println("Falha ao se conectar ao serviço.");
                    } catch (InterruptedException e) {
                        System.out.println("Conexão interrompida");
                    } catch (ErroDeConversaoDeAnoException e) {
                        System.out.println("Erro ao converter ano: " + e.getMessage());
                    } catch (NullPointerException e) {
                        System.out.println("Nome do filme informado é invalido!");
                    } catch (NumberFormatException e) {
                        System.out.println("Filme não encontrado! Verifique o nome e tente novamente.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro de argumento, verifique o endereço");
                    } catch (Exception e) {
                        System.out.println("Entre em contato com o time de suporte e informe o ocorrido!");
                        System.out.print("Erro: ");
                        System.out.println(e.getMessage());
                    }
                }

            } leitura.close();
        }
    }
