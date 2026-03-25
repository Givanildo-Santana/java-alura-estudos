package br.com.givanildo.desafios.ex01_verificando_se_um_numero_e_par_ou_impar.principal;

public class Principal {
    public static void main(String[] args) {
        int valor = 2;
        if (valor % 2 == 0) {
            System.out.println("O número " + valor + " é par.");
        } else {
            System.out.println("O número " + valor + " é ímpar.");
        }
    }

}



