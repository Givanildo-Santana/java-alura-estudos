package br.com.givanildo.modulo04.desafios.ex02_serializando_titulo_para_json.principal;

import br.com.givanildo.modulo04.desafios.ex02_serializando_titulo_para_json.model.Titulo;
import com.google.gson.Gson;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {

        String filme = """
                {
                "Name" : "Aladin",
                "Year" : "2019"
                }
                """;

        Gson json = new Gson();

        Titulo filme_json = json.fromJson(filme, Titulo.class);

        System.out.println(json.toJson(filme_json));

    }
}
