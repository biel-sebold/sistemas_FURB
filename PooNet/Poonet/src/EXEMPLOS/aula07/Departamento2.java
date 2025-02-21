/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXEMPLOS.aula07;

/**
 *
 * @author Almir
 */
public class Departamento2 {
    
    private String nome;
    private Funcionario2 gerente;

    public Departamento2(Funcionario2 gerente) {
        setGerente(gerente);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario2 getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario2 gerente) {
        if (gerente == null) {
            throw new IllegalArgumentException(
                    "Gerente é obrigatório!");
        }
        this.gerente = gerente;
    }
    
}
