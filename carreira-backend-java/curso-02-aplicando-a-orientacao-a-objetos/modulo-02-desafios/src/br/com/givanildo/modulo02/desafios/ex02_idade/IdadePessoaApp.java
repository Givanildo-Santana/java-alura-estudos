package br.com.givanildo.modulo02.desafios.ex02_idade;

public class IdadePessoaApp {

    public static void main(String[] args) {

        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Marcia Santos");
        pessoa.setIdade(35);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.verificarIdade();

    }
}
