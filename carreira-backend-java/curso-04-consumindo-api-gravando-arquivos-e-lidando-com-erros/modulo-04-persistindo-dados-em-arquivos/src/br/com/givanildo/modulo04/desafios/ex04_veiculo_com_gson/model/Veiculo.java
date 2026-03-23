package br.com.givanildo.modulo04.desafios.ex04_veiculo_com_gson.model;

public class Veiculo {
    private String nome;
    private String cor;

    public Veiculo(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCor(){
        return this.cor;
    }
}
