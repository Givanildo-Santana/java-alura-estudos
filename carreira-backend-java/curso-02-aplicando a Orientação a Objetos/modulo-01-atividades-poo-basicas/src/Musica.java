public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;


    void exibirFichaTecnica(){
        System.out.println("Titúlo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes ++;
    }

    double mediaAvaliacao(){
        return avaliacao / numAvaliacoes;
    }




}
