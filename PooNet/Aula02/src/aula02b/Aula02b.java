/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02b;

/**
 *
 * @author Almir
 */
public class Aula02b {
    public static void main(String[] args) {
        
        Aula2 a1 = new Aula2();
        a1.materia = "Programação";
        a1.tempo = 2;
        a1.alunos = 10;
        a1.exercicios = true;
        a1.presencial = true;
        
        
        a1.status();
        a1.anotações();
        a1.exercitando();
        a1.fimAula();
        
        Aula2 a2 = new Aula2();
        
        a2.materia = "Português";
        a2.tempo = 1;
        a2.alunos = 0;
        a2.exercicios = true;
        a2.presencial = false;
        
        a2.status();
        a2.anotações();
        a2.exercitando();
        a2.fimAula();
    }
    
}
