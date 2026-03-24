package br.com.givanildo.modulo05.desafio.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class SalvaEmJson {

    public void salvarJson(Endereco endereco) throws IOException {
        FileWriter escrita = new FileWriter("Consulta.json");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(endereco);

        escrita.write(json);
        escrita.close();
    }
}
