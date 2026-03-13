package br.com.givanildo.modulo02.desafios.ex01_conta;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
