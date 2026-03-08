package br.com.givanildo.modulo03.desafios.ex02_animal.model;

public class Gato extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Miua Miau Miau");
    }

    @Override
    public void locomover(){
        System.out.printf("%s está andando e miando!\n", getNome());
    }

    public void arranharMoveis(){
        System.out.printf("%s está arranhando os moveis!\n", getNome());
    }
}
