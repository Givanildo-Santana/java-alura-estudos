package br.com.givanildo.modulo02.desafios.ex03_record_livro_aninhado.principal;

import br.com.givanildo.modulo02.desafios.ex03_record_livro_aninhado.model.Livro;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        String json = """
                {"Titulo": "Percy Jackson",
                 "Autor": "Rick Riordan",
                 "Editora": {
                 "Nome": "Intrínseca"
                 }
                }
                """;

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);
    }
}
