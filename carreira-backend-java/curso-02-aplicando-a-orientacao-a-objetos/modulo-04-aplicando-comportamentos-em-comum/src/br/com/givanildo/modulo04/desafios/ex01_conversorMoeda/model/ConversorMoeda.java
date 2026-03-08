package br.com.givanildo.modulo04.desafios.ex01_conversorMoeda.model;

public class ConversorMoeda implements ConversaoFinanceira {

    private double cotacaoAtual = 5.10;

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * cotacaoAtual;
    }

}
