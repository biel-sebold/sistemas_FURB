/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02b;

/**
 *
 * @author Almir
 */
public class Aula2 {
    
    String materia;
    int tempo;
    int alunos;
    boolean exercicios;
    boolean presencial;
    
    void status(){
        System.out.println("Matéria: " + this.materia);
        System.out.println("Duração: " + this.tempo);
        System.out.println("Quantidade de alunos: " + this.alunos);
        System.out.println("Tiveram exercícios? " + this.exercicios);
        System.out.println("É presencial? " + this.presencial);
        
    }
    
    void anotações(){
        if (this.alunos == 0) {
            System.out.println("Sem anotações, ninguém veio");
            
        } else {
            System.out.println("Estou ecrevendo no quadro");
        }
        
    }
    
    void exercitando(){
        this.exercicios = true;
        
    }
    
    void fimAula(){
        this.exercicios = false;
        System.out.println("Sinal tocou, até amanhã!");
        
    }
    
}
