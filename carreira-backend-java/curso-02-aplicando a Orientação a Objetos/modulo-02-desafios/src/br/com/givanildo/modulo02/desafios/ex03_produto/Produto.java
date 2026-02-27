package br.com.givanildo.modulo02.desafios.model;

public class Produto {

    private String nome;
    private double preco;

    public String getNome(){
        return this.nome;
    }

    public Double getPreco(){
        return this.preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void aplicarDesconto(Double percentual){
        double desconto = this.preco * (percentual / 100);
        this.preco -= desconto;
    }

}
