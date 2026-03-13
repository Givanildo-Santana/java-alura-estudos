package br.com.givanildo.modulo03.desafios.ex06_formas_geometricas_com_interface.model;

public class Circulo implements Forma{

    private double raioDoCirculo;

    public Circulo(double raioDoCirculo) {
        this.raioDoCirculo = raioDoCirculo;
    }

    public double calcularArea(){
        return Math.PI * (raioDoCirculo * raioDoCirculo);
    }
}
