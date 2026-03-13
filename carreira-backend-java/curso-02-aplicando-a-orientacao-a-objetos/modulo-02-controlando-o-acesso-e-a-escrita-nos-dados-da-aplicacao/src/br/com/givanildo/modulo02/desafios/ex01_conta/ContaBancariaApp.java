package br.com.givanildo.modulo02.desafios.ex01_conta;

public class ContaBancariaApp {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Alan";
        conta.setNumeroConta(1234);
        conta.setSaldo(1000);

        System.out.println("Titular da conta: " + conta.titular);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.printf("Saldo da conta: R$ %.2f\n", conta.getSaldo());

    }
}
