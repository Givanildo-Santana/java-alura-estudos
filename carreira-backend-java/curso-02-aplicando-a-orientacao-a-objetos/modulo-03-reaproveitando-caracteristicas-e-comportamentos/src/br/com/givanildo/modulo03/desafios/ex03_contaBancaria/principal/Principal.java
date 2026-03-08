package br.com.givanildo.modulo03.desafios.ex03_contaBancaria.principal;

import br.com.givanildo.modulo03.desafios.ex03_contaBancaria.model.ContaCorrente;

public class Principal {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setNomeDoCliente("Matheus Pereira");
        conta.setNumeroDaConta("01054116-8");

        System.out.println("Realizando a operação de deposito!");
        conta.depositar(100);
        System.out.println(" ");
        System.out.println("Realizando a operação de saque!");
        conta.sacar(50);
        System.out.println(" ");

        conta.exibirDados();

        System.out.println(" ");
        System.out.println("Realizando a cobrança da tarifa mensal!");
        conta.cobrarTarifaMensal();
    }
}
