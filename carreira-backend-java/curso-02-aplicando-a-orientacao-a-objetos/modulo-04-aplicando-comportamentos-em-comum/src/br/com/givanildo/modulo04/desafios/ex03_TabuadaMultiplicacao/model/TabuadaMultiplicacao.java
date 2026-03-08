package br.com.givanildo.modulo04.desafios.ex03_TabuadaMultiplicacao.model;

public class TabuadaMultiplicacao implements Tabuada{

    public void exibirTabuada(int numero){
        if (numero <= 0 || numero > 10) {
            System.out.println("Numero invalido! digite um número entre 1 e 10");
            return;
        }
        for (int interador = 1; interador <= 10; interador++){
                System.out.printf("%d x %d = %d\n",interador,numero, (interador * numero));


        }
    }
}
