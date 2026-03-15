package br.com.givanildo.modulo05.desafios.principal;

import br.com.givanildo.modulo05.desafios.model.Cartao;
import br.com.givanildo.modulo05.desafios.model.Compra;
import br.com.givanildo.modulo05.desafios.model.ValidadorCompra;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Cartao cartao;
        Compra compra;
        String nomeDoProduto;
        double valorDoProduto;
        ValidadorCompra validadorDaCompra = new ValidadorCompra();
        List<Compra> listaDeCompras = new ArrayList();;


        System.out.print("Informe o limite do cartão: ");
        cartao = new Cartao(leitura.nextDouble());
        leitura.nextLine();

        int opcao = 2;
        while (opcao != 0) {
            System.out.print("Informe a descrição da compra: ");
            nomeDoProduto = leitura.nextLine();
            System.out.print("Informe o valor da compra: ");
            valorDoProduto = leitura.nextDouble();
            leitura.nextLine();
            compra = new Compra(nomeDoProduto, valorDoProduto);

            if (validadorDaCompra.validarCompra(cartao, compra)) {
                cartao.compra(valorDoProduto);
                System.out.println("Compra realizada");
                System.out.println(" ");
                listaDeCompras.add(compra);
            }else {
                System.out.printf("Limite insuficiente! limite disponível: %.2f ",cartao.getLimite());
                return;
            }

            System.out.print("Digite 0 para sair ou 1 para continuar: ");
            opcao = leitura.nextInt();
            System.out.println(" ");
            leitura.nextLine();

            if (opcao == 0){
                System.out.println("*".repeat(30));
                System.out.println("COMPRAS REALIZADAS:");
                System.out.println(" ");
                listaDeCompras.sort(Comparator.comparing(Compra::getValorDoProduto));
                for(Compra item: listaDeCompras){
                    System.out.println(item);
                }
                System.out.println(" ");
                System.out.println("*".repeat(40));
                System.out.println(" ");
                System.out.printf("Limite disponível no cartão: %.2f", cartao.getLimite());
                System.out.println(" ");
            }
        }


        leitura.close();
    }
}
