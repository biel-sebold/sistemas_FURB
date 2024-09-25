/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXEMPLOS.aula01;

/**
 *
 * @author Almir
 */
public class Cachorro {
    String nome;
    String raca;
    double peso;
    String cor;
    
    public Cachorro(){
        
    }
    
    public void latir() {
        System.out.println(nome + " está latindo!");
    }
    
    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }
    
    public void pegarObjeto(String objeto) {
        System.out.println(nome + " está buscando o(a) " + objeto);
    }
    
}
