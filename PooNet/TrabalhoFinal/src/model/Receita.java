package model;

import java.time.LocalDate;

import model.enums.CategReceita;

public class Receita extends Lancamento{

    private CategReceita categoria;

    public Receita(String descricao, Double valor, LocalDate data, CategReceita categoria){
        super(descricao, valor, data);
        this.categoria = categoria;
    }


    public CategReceita getCategoria() {
        return categoria;
    }
    
    public void setCategoria(CategReceita categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String getTipo() {
        return "Receita";
    }

    @Override
    public String toString() {
        return "\nReceita:\nCategoria: " + getCategoria() + "\nDescrição: " + getDescricao() + 
        "\nValor: R$" + getValor() + "\nData: " + getData();
    }

    
}

