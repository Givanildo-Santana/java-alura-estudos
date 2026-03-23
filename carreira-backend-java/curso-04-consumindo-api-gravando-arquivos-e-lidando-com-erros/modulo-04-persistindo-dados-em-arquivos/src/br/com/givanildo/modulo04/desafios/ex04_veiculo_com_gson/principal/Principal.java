package br.com.givanildo.modulo04.desafios.ex04_veiculo_com_gson.principal;

import br.com.givanildo.modulo04.desafios.ex04_veiculo_com_gson.model.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("carro", "branco");


        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String veiculoJson = gson.toJson(veiculo);

        System.out.println(veiculoJson);
    }
}
