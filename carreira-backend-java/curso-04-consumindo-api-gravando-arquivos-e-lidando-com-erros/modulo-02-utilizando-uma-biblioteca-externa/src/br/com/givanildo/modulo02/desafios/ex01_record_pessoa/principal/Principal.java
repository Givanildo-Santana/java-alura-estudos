package br.com.givanildo.modulo02.desafios.ex01_record_pessoa.principal;

import br.com.givanildo.modulo02.desafios.ex01_record_pessoa.model.Pessoa;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        String json = """
                     {
                        "Nome": "Lucas",
                        "Idade": 13,
                        "Cidade": "São Paulo",
                        "Pais": "Brasil"
                      }
                      """;

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(json);

        System.out.println(pessoa);

    }
}
