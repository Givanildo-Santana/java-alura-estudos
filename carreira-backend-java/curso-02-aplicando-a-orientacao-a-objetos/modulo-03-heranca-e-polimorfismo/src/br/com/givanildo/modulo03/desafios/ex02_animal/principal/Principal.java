package br.com.givanildo.modulo03.desafios.ex02_animal.principal;

import br.com.givanildo.modulo03.desafios.ex02_animal.model.Animal;
import br.com.givanildo.modulo03.desafios.ex02_animal.model.Cachorro;
import br.com.givanildo.modulo03.desafios.ex02_animal.model.Gato;

public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.setNome("Fred");
        cachorro.setRaca("Golden retriever");
        cachorro.setClasse("Mamífero");
        cachorro.setEspecie("Canina");
        cachorro.setTemDono(true);

        cachorro.exibirFicha();
        cachorro.abanarRabo();
        cachorro.locomover();
        cachorro.emitirSom();

        gato.setNome("Tom");
        gato.setRaca("Siamês");
        gato.setClasse("Mamífero");
        gato.setEspecie("Felina");
        gato.setTemDono(true);

        gato.exibirFicha();
        gato.arranharMoveis();
        gato.locomover();
        gato.emitirSom();



    }
}
