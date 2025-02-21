/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula2;

/**
 *
 * @author Almir
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /**
         * AULA 02
         * Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();*/
        ////////////////////////////////////////////////////////////////////////
        
        /**
         * AULA 03
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.tampar();
        c1.status();*/
        ////////////////////////////////////////////////////////////////////////
        
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        
        /**c1.setModelo("BIC");
        //c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        
        //c1.status();
        System.out.println("Tenho uma caneta" + c1.getModelo() + " de ponta" + c1.getPonta()); */
        c1.status();
        
        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        c2.status();
        
    }
    
}
