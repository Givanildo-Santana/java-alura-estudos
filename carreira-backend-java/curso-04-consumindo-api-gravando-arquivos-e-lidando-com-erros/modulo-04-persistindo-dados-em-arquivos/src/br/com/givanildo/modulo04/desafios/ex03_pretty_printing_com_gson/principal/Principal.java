package br.com.givanildo.modulo04.desafios.ex03_pretty_printing_com_gson.principal;

import br.com.givanildo.modulo04.desafios.ex02_serializando_titulo_para_json.model.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        String filme = """
                {
                "Name" : "Thor",
                "Year" : "2011"
                }
                """;

        Gson json = new GsonBuilder().setPrettyPrinting().create();

        Titulo filme_json = json.fromJson(filme, Titulo.class);

        System.out.println(json.toJson(filme_json));

    }
}
