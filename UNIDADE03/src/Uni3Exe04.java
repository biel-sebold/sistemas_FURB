package EXERCÍCIOS.UNIDADE03;

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        //Faça um programa para ler três notas de um aluno em uma disciplina e imprimir sua média ponderada (as notas têm pesos respectivos de 5, 3 e 2).

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Informe a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Informe a nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 * 5) + (nota2 * 3) + (nota3 * 2) / 10;

        System.out.printf("O valor da média do aluno é igual a %.1f", media);


    }
    
}
