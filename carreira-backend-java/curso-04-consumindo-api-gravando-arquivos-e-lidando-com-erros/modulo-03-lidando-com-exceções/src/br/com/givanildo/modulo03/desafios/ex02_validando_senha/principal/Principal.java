package br.com.givanildo.modulo03.desafios.ex02_validando_senha.principal;

import br.com.givanildo.modulo03.desafios.ex02_validando_senha.excecao.SenhaInvalidaException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);


        try {
            System.out.print("Informe sua senha: ");
            String senha = leitura.nextLine();
            validarSenha(senha);
        }
        catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if(senha.length() < 8 || senha.length() >12){
            throw new SenhaInvalidaException("Senha invalida! a senha deve possuir entre 8 e 12 caracteres");
        }
        else {
            System.out.println("Acesso liberado");
        }
    }
}
