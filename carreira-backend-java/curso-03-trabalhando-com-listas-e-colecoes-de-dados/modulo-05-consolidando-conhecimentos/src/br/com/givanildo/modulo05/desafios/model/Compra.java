package br.com.givanildo.modulo05.desafios.model;

public class Compra {
    private String nomeDoProduto;
    private double valorDoProduto;

    public Compra(String nomeDoProduto, double valorDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.valorDoProduto = valorDoProduto;
    }

    public String getNomeDoProduto() {
        return this.nomeDoProduto;
    }

    public double getValorDoProduto() {
        return this.valorDoProduto;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",getNomeDoProduto(), getValorDoProduto());
    }

}
