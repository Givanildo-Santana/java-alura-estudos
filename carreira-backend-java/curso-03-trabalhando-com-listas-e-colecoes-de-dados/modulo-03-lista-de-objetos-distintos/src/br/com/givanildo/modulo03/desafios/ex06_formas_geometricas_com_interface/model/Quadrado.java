package br.com.givanildo.modulo03.desafios.ex06_formas_geometricas_com_interface.model;

public class Quadrado implements Forma{

    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }
}
