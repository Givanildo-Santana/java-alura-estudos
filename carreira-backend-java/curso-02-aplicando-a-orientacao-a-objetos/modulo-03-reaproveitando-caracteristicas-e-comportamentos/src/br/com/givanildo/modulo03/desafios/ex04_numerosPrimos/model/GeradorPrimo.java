package br.com.givanildo.modulo03.desafios.ex04_numerosPrimos.model;

public class GeradorPrimo extends  NumerosPrimos{

    public void gerarProximoPrimo(int numeroPrimoBase){
        if(verificarPrimalidade(numeroPrimoBase)){
            int proximoNumeroPrimo = numeroPrimoBase + 1;
            while (!verificarPrimalidade(proximoNumeroPrimo)){
                proximoNumeroPrimo++;
            }
            System.out.println("O proximo número primo após o inforamdo é: " + proximoNumeroPrimo);
        }
        else{
            System.out.println("O numero informado não é um número primo");
        }
    }


}
