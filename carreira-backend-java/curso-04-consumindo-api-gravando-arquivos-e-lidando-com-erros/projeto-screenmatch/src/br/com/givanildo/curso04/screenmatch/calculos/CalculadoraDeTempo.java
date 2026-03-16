package br.com.givanildo.curso04.screenmatch.calculos;

import br.com.givanildo.curso04.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }
}