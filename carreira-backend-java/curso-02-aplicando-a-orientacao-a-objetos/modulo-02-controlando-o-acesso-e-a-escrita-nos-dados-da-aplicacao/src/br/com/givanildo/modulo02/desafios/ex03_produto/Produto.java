package br.com.givanildo.modulo02.desafios.ex03_produto;

public class Produto {

    private String nome;
    private double preco;

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        double desconto = this.preco * (percentual / 100);
        this.preco -= desconto;
    }

}
