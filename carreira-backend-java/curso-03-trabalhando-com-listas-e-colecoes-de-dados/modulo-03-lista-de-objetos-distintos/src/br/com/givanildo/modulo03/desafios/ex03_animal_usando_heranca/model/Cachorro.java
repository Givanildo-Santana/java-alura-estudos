package br.com.givanildo.modulo03.desafios.ex03_animal_usando_heranca.model;

public class Cachorro  extends Animal{

    private String nome;

    public Cachorro(String especie, int peso, String nome) {
        super(especie, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Especie: %s | Peso: %d Kg", getNome(),getEspecie(),getPeso());
    }
}
