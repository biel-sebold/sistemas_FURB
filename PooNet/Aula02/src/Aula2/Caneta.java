/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

/**
 *
 * @author Almir
 */
public class Caneta {
    
    /**
     * AULA 02 E 03
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
      
    }
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabsicar");
            
        } else {
            System.out.println("Estou rabiscando");
        }
        
    }
    
    public void tampar(){
        this.tampada = true;
        
    }
    
    public void destampar(){
        this.tampada = false;
        
    } */
    ////////////////////////////////////////////////////////////////////////////
    
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){ //CONSTRUTOR
        this.modelo = m;
        this.cor = c;
        this.ponta = p;        
        this.tampar();
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void status(){
        System.out.println("\nSOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
    
}
