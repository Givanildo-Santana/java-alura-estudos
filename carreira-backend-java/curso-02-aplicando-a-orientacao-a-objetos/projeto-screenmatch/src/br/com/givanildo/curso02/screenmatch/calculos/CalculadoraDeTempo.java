package br.com.givanildo.curso02.screenmatch.calculos;

import br.com.givanildo.curso02.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }
}