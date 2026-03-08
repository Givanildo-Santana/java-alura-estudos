package br.com.givanildo.modulo03.desafios.ex04_numerosPrimos.model;

public class VerificadorPrimo extends NumerosPrimos{

    public String verificarSeEhPrimo(int numero){
        if(verificarPrimalidade(numero)){
            return "O número " + numero + " é um número primo";
        }
        else {
            return "O número " + numero + " não é um número primo";
        }
    }
}
