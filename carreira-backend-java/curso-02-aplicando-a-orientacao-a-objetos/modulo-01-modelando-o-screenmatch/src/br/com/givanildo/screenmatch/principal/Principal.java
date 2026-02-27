package br.com.givanildo.screenmatch.principal;
import br.com.givanildo.screenmatch.model.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("Gato de botas");
        filme1.setAnoDeLancamento(2018);
        filme1.setDuracaoEmMinutos(150);
        filme1.setIncluidoNoPlano(true);



        filme1.exibeFichaTecnica();
        filme1.avalia(10);
        filme1.avalia(5);
        filme1.avalia(2);

        System.out.printf("Média das avaliações: %.2f", filme1.pegarMedia());
    }

}
