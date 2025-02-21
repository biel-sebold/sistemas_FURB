package com.mycompany.prova02;

public class Filme {
    
    private String nome;
    private int anoLancamento;
    private int duracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String cor) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double preco) {
        this.duracao = duracao;
    }
    
    public Categoria getCategoria(Categoria categoria){
        return categoria;
    }
    
    public void setCategoria(Categoria categoria){
        
    }
    
    public String imprimir(){
            System.out.println("Categoria: " + this.getCategoria());
            System.out.println("Filme: " + this.getNome());
            System.out.println("Ano de lançamento: " + this.getAnoLancamento());
            System.out.println("Duração: " + this.getDuracao() + " minutos");                             
        
    }
    
    
    
}
