/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelaçãoObjetos;

/**
 *
 * @author Almir
 */
public class Departamento {
    
    private String nome;
    private Funcionario gerente;
    
    public Departamento(Funcionario gerente){
        setGerente(gerente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario Gerente) { 
        if(gerente == null) {
        throw new IllegalArgumentException("Gerente é obrigatório");
        }
    this.gerente = gerente;
    } 
    
}
