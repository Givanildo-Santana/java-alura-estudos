    package br.com.givanildo.curso04.screenmatch.principal;

    import br.com.givanildo.curso04.screenmatch.model.Titulo;
    import br.com.givanildo.curso04.screenmatch.model.TituloOMDb;
    import com.google.gson.FieldNamingPolicy;
    import com.google.gson.Gson;
    import com.google.gson.GsonBuilder;

    import java.io.IOException;
    import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpRequest;
    import java.net.http.HttpResponse;
    import java.util.Scanner;

    public class PrincipalComBusca {
        public static void main(String[] args) throws IOException, InterruptedException {

            Scanner leitura = new Scanner(System.in);
            System.out.print("Informe o nome do filme: ");
            String busca = leitura.nextLine().replace(" ","+");
            String chaveapi = System.getenv("OMDB_API_KEY");
            String caminho = String.format("http://www.omdbapi.com/?t=%s&apikey=%s",busca,chaveapi);

            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(caminho)).build();
            HttpResponse<String>  response = cliente.send(request,HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            TituloOMDb tituloOMDb = gson.fromJson(json, TituloOMDb.class);
            Titulo titulo = new Titulo(tituloOMDb);

            System.out.printf("\n%s Informações do titulo %s\n","*".repeat(10), "*".repeat(10));
            System.out.println(titulo);
            System.out.printf("*".repeat(43));
            leitura.close();
        }
    }
