/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXEMPLOS.aula02;

/**
 *
 * @author Almir
 */
public class App {
    
    public static void main(String[] args) {
        
        // Declaração do objeto
        Pessoa variavelPessoa;
        
        // Criação do objeto;
        variavelPessoa = new Pessoa();
        
        // Utilização do objeto.
        variavelPessoa.nome = "andre";
        variavelPessoa.altura = 1.79;
        variavelPessoa.peso = 100;
        
        double imc = variavelPessoa.calcularImc();
        
        System.out.println(imc);
        
    }
    
}
