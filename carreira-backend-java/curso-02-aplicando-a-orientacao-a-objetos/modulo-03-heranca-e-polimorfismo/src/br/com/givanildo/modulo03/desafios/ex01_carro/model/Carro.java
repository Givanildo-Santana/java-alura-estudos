package br.com.givanildo.modulo03.desafios.ex01_carro.model;

public class Carro {

    private String modelo;
    private int anoDeFabricacao;
    private String cor;
    private double valor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private int calcularIdade(int anoAtual) {
        return anoAtual - this.anoDeFabricacao;
    }

    public void exibirInfo(int anoAtual) {
        System.out.printf("Modelo: %s\n", modelo);
        System.out.printf("Ano de fabricação: %d\n", anoDeFabricacao);
        System.out.printf("Cor: %s\n", cor);
        System.out.printf("Valor: R$ %.2f\n", valor);
        System.out.printf("Idade do carro: %d anos\n", calcularIdade(anoAtual));
    }
}