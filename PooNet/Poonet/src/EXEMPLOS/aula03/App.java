/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXEMPLOS.aula03;

/**
 *
 * @author Almir
 */
public class App {
    public static void main(String[] args) {
        
        // Declaração do objeto
        Pessoa p1;
        
        // Criação do objeto;
        p1 = new Pessoa();
        
        // Utilização do objeto.
        p1.setNome("andre");
        p1.setAltura(1.90);
        p1.setPeso(80);
        
        
        Pessoa p2 = new Pessoa();
        p2.setNome("joão");
        
        p1.copiaDados(p2);
        
        double imc = p1.calcularImc();
        
        double imc2 = p2.calcularImc();
        
        System.out.println("IMC Pessoa 1" + imc);
        System.out.println("IMC Pessoa 2" + imc2);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        ContaBancaria c1 = new ContaBancaria();
        c1.depositar(1000);
        c1.depositar(700);
        
        
        ContaBancaria c2 = new ContaBancaria();
        c2.depositar(5000);
        
        c2.transferir(c1, 1800);
        
        System.out.println("Saldo conta 1: " + c1.getSaldo());
        
        System.out.println("Saldo conta 2: " + c2.getSaldo());     
        
    }
    
}
