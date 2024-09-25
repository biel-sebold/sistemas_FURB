/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXEMPLOS.aula02;

/**
 *
 * @author Almir
 */
public class Pessoa {
    
    double altura;
    double peso;
    String nome;
    
    double calcularImc() {
        return peso / (altura * altura);
    }
    
}
