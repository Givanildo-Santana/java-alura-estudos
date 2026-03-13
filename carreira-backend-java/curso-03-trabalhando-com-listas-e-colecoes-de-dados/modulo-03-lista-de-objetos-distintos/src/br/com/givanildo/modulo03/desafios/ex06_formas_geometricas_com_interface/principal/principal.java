package br.com.givanildo.modulo03.desafios.ex06_formas_geometricas_com_interface.principal;

import br.com.givanildo.modulo03.desafios.ex06_formas_geometricas_com_interface.model.Circulo;
import br.com.givanildo.modulo03.desafios.ex06_formas_geometricas_com_interface.model.Forma;
import br.com.givanildo.modulo03.desafios.ex06_formas_geometricas_com_interface.model.Quadrado;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        ArrayList<Forma> listaDeFormas = new ArrayList<>();

        Circulo circulo1 = new Circulo(3.7);
        Quadrado quadrado1 = new Quadrado(7.3);

        listaDeFormas.add(circulo1);
        listaDeFormas.add(quadrado1);

        for (Forma item : listaDeFormas){
            System.out.printf("Área da forma: %.2fm²\n", item.calcularArea());
        }
    }

}
