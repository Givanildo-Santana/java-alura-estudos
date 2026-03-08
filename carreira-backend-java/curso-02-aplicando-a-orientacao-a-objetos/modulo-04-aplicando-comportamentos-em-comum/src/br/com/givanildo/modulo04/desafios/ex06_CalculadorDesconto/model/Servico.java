package br.com.givanildo.modulo04.desafios.ex06_CalculadorDesconto.model;

public class Servico implements Vendavel{

    private String nome;
    private int quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoTotal(int quantidade){
        if (quantidade > 3){
           return preco - (preco * 0.15);
        }
        else if(quantidade > 1){
           return preco - (preco * 0.10);
        }
        else {
            return preco;
        }
    }
}
