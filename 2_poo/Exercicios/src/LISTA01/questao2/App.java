package POO.Exercicios.src.LISTA01.questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Copie a classe Pessoa do exercício anterior para um novo pacote. Implemente um novo programa (classe App) que solicite ao usuário sua altura e peso e exiba na tela qual é o IMC desta pessoa. 

        Pessoa pessoa1 = new Pessoa();

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        pessoa1.altura = sc.nextDouble();

        System.out.print("Informe o peso: ");
        pessoa1.peso = sc.nextDouble();
      

        System.out.printf("\nIMC: %.1f", pessoa1.calcularImc());

        sc.close();

        

        
    }
}
