/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA02.questao01;
import java.util.Scanner;

/**
 *
 * @author Almir
 */
public class App {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {

            System.out.print("\nInforme o nome: ");
            String nome = sc.next();

            System.out.printf("Informe a altura (%s): ", nome);
            double altura = sc.nextDouble();
            
            System.out.printf("Informe o peso (%s): ", nome);
            double peso = sc.nextDouble();

            Pessoa pessoa = new Pessoa();

            pessoa.setNome(nome);
            pessoa.setAltura(altura);
            pessoa.setPeso(peso);

            pessoas[i] = pessoa; 

        }
        
        for (int i = pessoas.length - 1; i >= 0; i--) {
            
            System.out.printf("\n\nNome: %s\n", pessoas[i].getNome());
            System.out.printf("Altura: %.2f\n", pessoas[i].getAltura());
            System.out.printf("Peso: %.1f\n", pessoas[i].getPeso());
            System.out.printf("IMC PESSOA %d = %.1f\n\n", i, pessoas[i].calcularImc());
        }

        sc.close();
    
    }
    
}
