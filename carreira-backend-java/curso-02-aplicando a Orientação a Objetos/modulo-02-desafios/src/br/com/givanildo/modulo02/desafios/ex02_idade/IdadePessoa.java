package br.com.givanildo.modulo02.desafios.model;

public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void verificarIdade(){
        if (idade >= 18){
            System.out.println(nome + " é maior de Idade");
        }
        else {
            System.out.println(nome + " não é maior de Idade");
        }
    }
}
