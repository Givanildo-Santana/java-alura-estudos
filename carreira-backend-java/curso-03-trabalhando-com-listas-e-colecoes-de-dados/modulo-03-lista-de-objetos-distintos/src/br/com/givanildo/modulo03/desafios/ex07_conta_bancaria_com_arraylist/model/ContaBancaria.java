package br.com.givanildo.modulo03.desafios.ex07_conta_bancaria_com_arraylist.model;

public class ContaBancaria {

    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }
}
