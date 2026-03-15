package br.com.givanildo.modulo05.desafios.model;

public class ValidadorCompra {

    public boolean validarCompra(Cartao cartao, Compra compra){
        if (compra.getValorDoProduto() <= cartao.getLimite()){
            return true;
        }
        else {
            return false;
        }
    }


}
