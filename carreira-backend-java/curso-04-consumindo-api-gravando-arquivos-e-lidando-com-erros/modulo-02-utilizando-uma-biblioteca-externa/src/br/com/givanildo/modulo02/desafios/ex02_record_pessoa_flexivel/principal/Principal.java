package br.com.givanildo.modulo02.desafios.ex02_record_pessoa_flexivel.principal;
import br.com.givanildo.modulo02.desafios.ex01_record_pessoa.model.Pessoa;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        String json = """
                     {
                        "Nome": "Lucas",
                        "Idade": 16,
                        "Cidade": "São Paulo",
                        "Pais": "Brasil"
                        
                      }
                      """;


        String json2 = """
                     {
                        "Nome": "Marcos",
                        "Idade": 14
                     }
                      """;
        System.out.println("Pessoa 1");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(json);
        System.out.println(pessoa);

        System.out.println(" ");
        System.out.println("Pessoa 2");
        Gson gson2 = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Pessoa pessoa2 = gson2.fromJson(json2, Pessoa.class);
        System.out.println(json2);
        System.out.println(pessoa2);
    }
}
