package br.com.givanildo.modulo05.desafio.principal;

import br.com.givanildo.modulo05.desafio.model.ConsultaCep;
import br.com.givanildo.modulo05.desafio.model.Endereco;
import br.com.givanildo.modulo05.desafio.model.SalvaEmJson;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep requisicao = new ConsultaCep();
        SalvaEmJson file = new SalvaEmJson();

        System.out.print("Informe o Cep para ver os dados da rua: ");
        String cep = leitura.nextLine();

        try {
            Endereco endereco = requisicao.consultarEndereco(cep);
            System.out.println(endereco);

            file.salvarJson(endereco);

        } catch (Exception e){
            System.out.println("Cep Invalido");
        }




    }
}
