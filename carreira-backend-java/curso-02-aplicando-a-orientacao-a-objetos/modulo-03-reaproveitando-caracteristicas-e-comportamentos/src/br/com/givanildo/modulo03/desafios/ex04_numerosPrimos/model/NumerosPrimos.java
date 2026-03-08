package br.com.givanildo.modulo03.desafios.ex04_numerosPrimos.model;

public class NumerosPrimos {


    public boolean verificarPrimalidade(int numero){

        for (int i = 2; i < numero; i++){
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limite){
        System.out.print("Números primos: ");
        for (int i = 2; i <= limite; i++){
            if (verificarPrimalidade(i)){
                System.out.print(i + ", ");
            }

        }
    }
}
