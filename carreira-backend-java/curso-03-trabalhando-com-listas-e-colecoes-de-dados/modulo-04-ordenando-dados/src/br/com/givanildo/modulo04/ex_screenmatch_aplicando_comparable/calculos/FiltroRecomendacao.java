package br.com.givanildo.modulo04.ex_screenmatch_aplicando_comparable.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esté está entre os preferidos do momento!");
        }
        else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no memento!");
        }
        else {
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}

