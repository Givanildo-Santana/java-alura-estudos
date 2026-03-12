package br.com.givanildo.modulo01.desafios.model;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
        return String.format(" |Nome: %s - idade: %d anos| ",this.getNome(),this.getIdade());
    }
}
