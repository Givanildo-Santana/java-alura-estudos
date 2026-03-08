package br.com.givanildo.modulo04.desafios.CalculadorTaxa.model;

public class ProdutoFisico implements Calculavel{

    private String nome;
    private double preco;
    private double taxa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa(){
        return this.taxa;
    }

    @Override
    public double calcularPrecoFinal(){
        return preco + (preco * (taxa / 100));
    }
}
