package br.com.givanildo.modulo02.desafios.model;

public class ProdutoPerecivel extends Produto{
    private String dataDeValidade;

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade){
        super(nome,preco,quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return String.format("Nome do produto: %s | Preço: %.2f | Quantidade: %d | Data de validade %s", getNome(),getPreco(),getQuantidade(),getDataDeValidade());
    }
}
