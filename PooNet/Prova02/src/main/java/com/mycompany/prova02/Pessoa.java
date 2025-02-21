package com.mycompany.prova02;

import java.util.Date;

public class Pessoa {
    
    private String nome;
    private String email;
    private Date dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public int getIdade(){
        System.out.println("Informe sua idade: " + this.getDataNascimento() - 2024);
        
    }
    
   
    
    
}
