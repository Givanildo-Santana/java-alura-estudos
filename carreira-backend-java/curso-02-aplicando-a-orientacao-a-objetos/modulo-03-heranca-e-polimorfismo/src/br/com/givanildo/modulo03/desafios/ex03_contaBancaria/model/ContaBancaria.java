package br.com.givanildo.modulo03.desafios.ex03_contaBancaria.model;

public class ContaBancaria {
    private String nomeDoCliente;
    private String numeroDaConta;
    private double saldo;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void consultaSaldo() {
        System.out.println("Saldo: " + saldo);
    }
    public void depositar(double valorDoDeposito){
        if(valorDoDeposito > 0){
            this.saldo += valorDoDeposito;
            System.out.println("Saldo após a operação: " + this.saldo);
        }
        else{
            System.out.println("Valor invalido");
        }
    }

    public void sacar(double valorDoSaque){
        if (valorDoSaque <=0){
            System.out.println("Valor invalido!");
            return;
        }
        if (valorDoSaque <= this.saldo){
            this.saldo -= valorDoSaque;
            System.out.println("Saldo após a operação: " + this.saldo);
        }
        else{
            System.out.println("Saldo insuficiente para realizar a operação");
        }
    }

    public void exibirDados(){
        System.out.println(" ");
        System.out.println("Nome do cliente: " + nomeDoCliente);
        System.out.println("Numero da conta: " + numeroDaConta);
        System.out.println("Saldo atual da conta: " + saldo);
    }
}
