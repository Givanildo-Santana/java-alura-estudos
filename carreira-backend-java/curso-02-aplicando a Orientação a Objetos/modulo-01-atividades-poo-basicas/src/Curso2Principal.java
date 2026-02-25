import java.util.Scanner;

public class Curso2Principal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        Calculadora calculadora = new Calculadora();
        Musica musica = new Musica();
        Carro carro = new Carro();
        Aluno aluno = new Aluno();

        int opcao = 0;



        while (opcao != 6){

            System.out.print("""
        
        Digite a opção desejada:
        
        1 - Pessoa
        2 - Calculadora
        3 - Música
        4 - Carro
        5 - Aluno
        6 - PARA SAIR
        
        """);
            System.out.print("Opção: ");
            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 1){
                pessoa.exibir();
                System.out.println(" ");
            }
            else if (opcao == 2){

                System.out.print("Entre com um numero: ");
                int numero = leitura.nextInt();
                System.out.println("O dobro do número informado é " + calculadora.calcularDobro(numero));
                System.out.println(" ");
            }
            else if (opcao == 3){

                System.out.println("Entre com as informações da música");
                System.out.print("Titúlo: ");
                String titulo = leitura.nextLine();
                musica.titulo = titulo;
                System.out.print("Artista: ");
                String artista = leitura.nextLine();
                musica.artista = artista;
                System.out.print("Ano de lançamento: ");
                int anoDeLancamento = leitura.nextInt();
                leitura.nextLine();
                musica.anoLancamento = anoDeLancamento;
                System.out.println(" ");

                musica.exibirFichaTecnica();
                System.out.println(" ");

                System.out.print("Ver ou tribuir nota? [SIM] [NÃO]: ");
                String opcaoNota =  leitura.nextLine();
                System.out.println(" ");
                    if(opcaoNota.toUpperCase().equals("SIM")) {
                        System.out.print("Digite [1] para ver nota ou [2] para atribuir nota: ");
                        int opcaoN = leitura.nextInt();
                        System.out.println(" ");
                        if (opcaoN == 1) {
                            if (musica.mediaAvaliacao() >= 0) {
                                System.out.println("Media Avaliação: " + musica.mediaAvaliacao());
                            } else {
                                System.out.println("A musica ainda não possui avaliações!");
                                System.out.println(" ");
                            }
                        } else if (opcaoN == 2) {
                            System.out.print("Informe a nota: ");
                            double nota = leitura.nextDouble();
                            leitura.nextLine();
                            System.out.println("Foi atribuido a nota: " + nota);
                            musica.avaliar(nota);
                        }
                    }
                    else if(opcaoNota.toUpperCase().equals("NÃO")){
                        System.out.println("Opção [NÃO] foi selecionada, saindo do menú!");
                        return;
                    }
                    else {
                        System.out.println("Opção invalida!");
                    }

            }
            else if (opcao == 4){

                System.out.println("Entre com as informações do veículo");
                System.out.print("Modelo: ");
                String modelo = leitura.nextLine();
                carro.modelo = modelo;
                System.out.print("Ano: ");
                int ano = leitura.nextInt();
                leitura.nextLine();
                carro.ano = ano;
                System.out.print("Ano Atual: ");
                int anoAtual = leitura.nextInt();
                leitura.nextLine();
                System.out.print("Cor: ");
                String cor = leitura.nextLine();
                carro.cor = cor;
                System.out.println(" ");
                carro.exibirFichaTecnica();
                System.out.println(" ");
                System.out.println("Idade do Veículo: " + carro.idadeDoCarro(anoAtual) + " anos");
                System.out.println(" ");
            }
            else if (opcao == 5){

                System.out.println("Entre com as informações do aluno");
                System.out.print("Nome: ");
                String nome = leitura.nextLine();
                aluno.nome = nome;
                System.out.print("Idade: ");
                int idade = leitura.nextInt();
                leitura.nextLine();
                aluno.idade = idade;
                System.out.println(" ");

                aluno.exibirInformacoes();
                System.out.println(" ");
            }
            else if (opcao == 6) {
                System.out.println("Finalizando");
                leitura.close();
                break;
            }
            else {
                System.out.println("Opção invalida!");
            }
        }

    }
}
