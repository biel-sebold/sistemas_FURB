/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA01.questao03;
import java.util.Scanner;

/**
 *
 * @author Almir
 */
public class App {
    public static void main(String[] args) {

        //Num terceiro pacote, copie novamente a classe Pessoa da questão anterior e implemente um programa (classe App) que calcule o IMC de três pessoas. Para cada pessoa, o programa deve solicitar a altura e seu peso e em seguida, exibir o IMC calculado.
       
        Pessoa pessoa = new Pessoa();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.printf("Informe a altura de %d: ", i+1);
            pessoa.altura = sc.nextDouble();

            System.out.printf("Informe o peso de %d: ", i+1);
            pessoa.peso = sc.nextDouble();

            System.out.printf("\n>>>IMC PESSOA %d = %.1f<<<\n\n", i+1, pessoa.calcularImc());
            
        }
    

        sc.close();
   
    }
    
}
