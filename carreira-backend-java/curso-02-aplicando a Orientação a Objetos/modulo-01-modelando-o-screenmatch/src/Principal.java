public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.nome = "Gato de botas";
        filme1.anoDeLancamento = 2018;
        filme1.duracaoEmMinutos = 150;
        filme1.incluidoNoPlano = true;



        filme1.exibeFichaTecnica();
        filme1.avalia(10);
        filme1.avalia(5);
        filme1.avalia(2);

        System.out.println("Soma das avaliações: " + filme1.somaDasAvaliacoes);
        System.out.println("Quantidade de avaliações: " + filme1.totalDeAvaliacoes);
        System.out.printf("Média das avaliações: %.2f", filme1.pegarMedia());
    }

}
