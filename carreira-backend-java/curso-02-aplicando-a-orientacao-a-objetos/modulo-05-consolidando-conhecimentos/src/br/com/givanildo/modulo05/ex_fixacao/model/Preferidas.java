package br.com.givanildo.modulo05.ex_fixacao.model;

public class Preferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() > 9) {
            System.out.println(audio.getTitulo() + " É considerado sucesso absoluto");
        }
        else {
            System.out.println(audio.getTitulo() + " Também é um dos que todo mundo está curtindo");
        }
    }
}
