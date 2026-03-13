package br.com.givanildo.modulo03.desafios.ex03_animal_usando_heranca.principal;

import br.com.givanildo.modulo03.desafios.ex03_animal_usando_heranca.model.Animal;
import br.com.givanildo.modulo03.desafios.ex03_animal_usando_heranca.model.Cachorro;

public class Principal {
    public static void main(String[] args) {

        Animal doginho = new Cachorro("PitBull", 23, "Pep");
        System.out.println(doginho.toString());
    }
}
