package com.mycompany.prova02;

public enum Categoria {
    ACAO("Ação"),

    COMEDIA("Comédia"),

    TERROR("Terror"),

    ROMANCE("Romance"),
    
    FICCAO("Ficção"),
    
    AVENTURA("Aventura"),
    
    ANIMACAO("Animação");
    
    private final String categoria;
    
    private Categoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public String toString() {
        return getCategoria();
    }
    
}
