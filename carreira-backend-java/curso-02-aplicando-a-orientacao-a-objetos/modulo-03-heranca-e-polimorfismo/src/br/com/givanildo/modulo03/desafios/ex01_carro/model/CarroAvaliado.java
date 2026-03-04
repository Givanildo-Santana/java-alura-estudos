package br.com.givanildo.modulo03.desafios.ex01_carro.model;

public class CarroAvaliado extends Carro {

    private double precoAno1;
    private double precoAno2;
    private double precoAno3;


    public void setPrecos(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calcularMenorPreco() {
        double menorPreco = this.precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = this.precoAno2;
        }if (precoAno3 < menorPreco) {
            menorPreco = this.precoAno3;
        }

        return  menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = this.precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = this.precoAno2;
        }if (precoAno3 > maiorPreco) {
            maiorPreco = this.precoAno3;
        }

        return  maiorPreco;
    }

    @Override
    public void exibirInfo(int anoAtual) {
        super.exibirInfo(anoAtual);
        System.out.printf("Menor preço dos últimos 3 anos %.2f\n", calcularMenorPreco());
        System.out.printf("Maior preço do últimos 3 anos %.2f\n", calcularMaiorPreco());

    }
}
