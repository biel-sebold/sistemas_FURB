/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXEMPLOS.aula01;

/**
 *
 * @author Almir
 */
public class Matilha {
    
    public static void main(String[] args) {
        Cachorro cachorro1;
        cachorro1 = new Cachorro();
        
        cachorro1.nome = "pingo";
        cachorro1.cor = "branco";
        cachorro1.peso = 12;
        cachorro1.raca = "labrador";
        
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "brutos";
        cachorro2.cor = "marrom";
        cachorro2.peso = 21;
        cachorro2.raca = "pastor alemão";
        
        cachorro1.latir();
        
        cachorro2.abanarRabo();
        
        Cachorro cachorro3 = cachorro1;
        
        cachorro3.abanarRabo();
        
        cachorro3.nome = "floquinho";
        
        cachorro1.abanarRabo();
        
        int a = 5;
        
        int b = a;
        
        a = 10;
       
        System.out.println("A= " + a);
        System.out.println("B= " + b);
    }
}