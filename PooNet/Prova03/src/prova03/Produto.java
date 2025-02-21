package prova03;

public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;
    private double valorTotal;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valorTotal = preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getString() {
        return nome + "," + preco + "," + quantidade + "," + valorTotal;
    }
}

