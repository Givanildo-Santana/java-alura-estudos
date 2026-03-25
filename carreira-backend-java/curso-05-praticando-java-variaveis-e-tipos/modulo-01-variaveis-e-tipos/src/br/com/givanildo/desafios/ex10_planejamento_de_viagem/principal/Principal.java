package br.com.givanildo.desafios.ex10_planejamento_de_viagem.principal;

public class Principal {
        public static void main(String[] args) {

            double consumoMedio = 10.5;
            double capacidadeTanque = 45;
            double combustivelAtual = 25;
            double distanciaViagem = 400;

            double autonomiaMaxima = consumoMedio * capacidadeTanque;
            double autonomiaAtual = consumoMedio * combustivelAtual;

            System.out.printf("Autonomia máxima do veículo: %.1f km%n", autonomiaMaxima);
            System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);

            if (autonomiaAtual >= distanciaViagem) {
                System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
            } else {
                System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
            }
        }

}
