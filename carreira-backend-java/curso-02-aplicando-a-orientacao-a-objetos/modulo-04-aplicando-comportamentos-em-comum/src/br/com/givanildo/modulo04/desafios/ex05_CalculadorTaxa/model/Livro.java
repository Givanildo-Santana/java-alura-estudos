package br.com.givanildo.modulo04.desafios.ex05_CalculadorTaxa.model;

public class Livro implements Calculavel{

    private double preco;
    private double desconto;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    @Override
    public double calcularPrecoFinal(){
        return preco - (preco * (desconto / 100));
    }

}
