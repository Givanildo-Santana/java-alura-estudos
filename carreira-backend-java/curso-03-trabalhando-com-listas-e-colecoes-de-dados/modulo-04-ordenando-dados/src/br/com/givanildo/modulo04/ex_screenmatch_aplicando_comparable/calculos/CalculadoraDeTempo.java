package br.com.givanildo.modulo04.ex_screenmatch_aplicando_comparable.calculos;

import br.com.givanildo.modulo04.ex_screenmatch_aplicando_comparable.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }
}