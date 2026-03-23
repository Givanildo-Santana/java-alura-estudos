package br.com.givanildo.modulo04.desafios.ex02_serializando_titulo_para_json.model;

import com.google.gson.annotations.SerializedName;

public class Titulo {
    @SerializedName("Name")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;

    public String getNome(){
        return this.nome;
    }
    public int getAnoDeLancamento(){
        return this.anoDeLancamento;
    }

}
