package com.mycompany.prova02;

public class Catalogo extends Pessoa{
    
    public Pessoa getPessoa(){
        return pessoa;
    }
    
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public String getQuantidadeItensDesejados(String indicacao){
        return indicacao;
    }
    
    public int getQuantidadeItensAssistidos(){
        return
    }
    
    public Filme getFilmeMaiorNota(){
        
    }
    
    public String imprimir(){
        System.out.println("Pessoa: " + this.getPessoa());
        System.out.println("Quantos itens desejados? " + this.getQuantidadeItensDesejados());
        System.out.println("Quantos itens assistidos? " + this.getQuantidadeItensAssistidos());
        System.out.println("Item com a maior nota: " + this.getFilmeMaiorNota());
        
        
    }
    
    
    
}
