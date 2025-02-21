/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA01.questao01;

/**
 *
 * @author Almir
 */
public class App {
    public static void main(String[] args) {

        //O método calcularImc() da classe Pessoa deverá calcular o IMC da pessoa, usando a fórmula: p/h^2
        //No método main() da classe App utilize a classe Pessoa para calcular o IMC de uma pessoa que tem 1,75 m de altura e 78 Kg. O programa deverá apresentar o IMC calculado na tela.

        Pessoa gabriel = new Pessoa();

        gabriel.peso = 78;
        gabriel.altura = 1.75;

        System.out.printf("IMC: %.1f", gabriel.calcularImc());

        

        
    }
    
}
