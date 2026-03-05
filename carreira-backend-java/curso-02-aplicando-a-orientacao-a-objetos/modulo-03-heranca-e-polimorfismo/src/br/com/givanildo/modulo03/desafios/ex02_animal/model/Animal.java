package br.com.givanildo.modulo03.desafios.ex02_animal.model;

public class Animal {
    private String nome;
    private String classe;
    private String especie;
    private String raca;
    private boolean temDono;

    public String getClasse() {
        return classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isTemDono() {
        return temDono;
    }

    public void setTemDono(boolean temDono) {
        this.temDono = temDono;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void emitirSom(){
        System.out.println("Som");
    }

    public void locomover(){
        System.out.printf("%s a %s está se locomovendo", nome, especie);
    }

    public void exibirFicha(){
        System.out.println(" ");
        System.out.println("Informações do animal\n");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Espécie: " + especie);
        System.out.println("Raça: " + raca);
        System.out.println("Tem dono: " + temDono);
        System.out.println(" ");
    }



}
