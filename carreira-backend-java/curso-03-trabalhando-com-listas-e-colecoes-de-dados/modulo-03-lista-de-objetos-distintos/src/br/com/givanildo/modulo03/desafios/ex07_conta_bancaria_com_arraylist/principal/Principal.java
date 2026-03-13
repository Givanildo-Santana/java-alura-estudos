package br.com.givanildo.modulo03.desafios.ex07_conta_bancaria_com_arraylist.principal;

import br.com.givanildo.modulo03.desafios.ex07_conta_bancaria_com_arraylist.model.ContaBancaria;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria("12345",400);
        ContaBancaria conta2 = new ContaBancaria("25413",800);
        ContaBancaria conta3 = new ContaBancaria("84162",150);

        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        ContaBancaria contaComMaiorSaldo = listaDeContas.get(0);
        for (ContaBancaria conta: listaDeContas){
            if (conta.getSaldo() > contaComMaiorSaldo.getSaldo()){
                contaComMaiorSaldo = conta;
            }
        }
        System.out.printf("Conta com maior saldo: %s | R$ %.2f", contaComMaiorSaldo.getNumeroDaConta(),contaComMaiorSaldo.getSaldo());
    }
}
