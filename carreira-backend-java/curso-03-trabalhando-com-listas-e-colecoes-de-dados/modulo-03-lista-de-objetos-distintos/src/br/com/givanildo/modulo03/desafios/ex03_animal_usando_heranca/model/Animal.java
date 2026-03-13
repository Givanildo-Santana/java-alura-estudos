package br.com.givanildo.modulo03.desafios.ex03_animal_usando_heranca.model;

public class Animal {
    private String especie;
    private int peso;

    public Animal(String especie, int peso){
        this.especie = especie;
        this.peso =peso;
    }

    public void emitirSom(){
        System.out.println("Som");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("Especie: %s | Peso: %d Kg",getEspecie(),getPeso());
    }
}
