package br.com.givanildo.modulo05.desafios.model;

public class Cartao {
    private double limite;

    public Cartao(double limite){
        if (limite > 0) {
            this.limite = limite;
        }
    }

    public double getLimite(){
        return this.limite;
    }

    public void compra(double valorDaCompra){
        if (valorDaCompra <= getLimite()){
            this.limite -= valorDaCompra;
        }
    }

}
