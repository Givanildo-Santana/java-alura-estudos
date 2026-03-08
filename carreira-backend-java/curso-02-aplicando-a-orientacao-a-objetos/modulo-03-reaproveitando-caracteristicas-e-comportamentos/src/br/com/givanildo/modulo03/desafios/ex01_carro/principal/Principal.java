package br.com.givanildo.modulo03.desafios.ex01_carro.principal;

import br.com.givanildo.modulo03.desafios.ex01_carro.model.CarroAvaliado;

public class Principal {

    public static void main(String[] args) {

        CarroAvaliado carroAvaliado = new CarroAvaliado();

        carroAvaliado.setModelo("Azera");
        carroAvaliado.setCor("Preto");
        carroAvaliado.setAnoDeFabricacao(2015);
        carroAvaliado.setValor(82000);
        carroAvaliado.setPrecos(80000,85000,83500);

        carroAvaliado.exibirInfo(2026);
    }
}
