/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA01.questao04;

/**
 *
 * @author Almir
 */
public class Pessoa {
    String nome;
    double altura;
    double peso;

    public Pessoa(String nome, double altura, double peso){ //construtor
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularImc() {
        double result = peso / (Math.pow(altura, 2));
        return result;
    }
    
}
