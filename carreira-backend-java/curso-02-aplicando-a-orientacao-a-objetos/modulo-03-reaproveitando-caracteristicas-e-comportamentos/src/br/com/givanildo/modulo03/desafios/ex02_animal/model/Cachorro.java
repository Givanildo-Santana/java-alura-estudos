package br.com.givanildo.modulo03.desafios.ex02_animal.model;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Au Au Au");
    }

    @Override
    public void locomover(){
        System.out.printf("%s está correndo!\n", getNome());
    }

    public void abanarRabo(){
        System.out.printf("%s está abanando o rabo!\n", getNome());
    }
}
