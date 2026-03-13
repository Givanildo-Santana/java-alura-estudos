package br.com.givanildo.modulo03.desafios.ex04_usando_usando_instanceof.principal;
import br.com.givanildo.modulo03.desafios.ex03_animal_usando_heranca.model.Animal;
import br.com.givanildo.modulo03.desafios.ex03_animal_usando_heranca.model.Cachorro;

public class Principal {
    public static void main(String[] args) {

            Animal dog = new Cachorro("PitBull", 23, "Pep");

            if (dog instanceof  Cachorro) {
                Cachorro doguinho = (Cachorro) dog;
                System.out.println(doguinho.getNome());
            }
        }
}
