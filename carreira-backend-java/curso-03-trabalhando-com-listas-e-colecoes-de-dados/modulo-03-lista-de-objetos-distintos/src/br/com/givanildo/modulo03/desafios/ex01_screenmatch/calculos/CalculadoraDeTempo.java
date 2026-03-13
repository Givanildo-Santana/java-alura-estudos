package br.com.givanildo.modulo03.desafios.ex01_screenmatch.calculos;

import br.com.givanildo.modulo03.desafios.ex01_screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }
}