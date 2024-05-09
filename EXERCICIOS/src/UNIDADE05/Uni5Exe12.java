package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        //Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triângulo de Floyd:

        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15
        // 16 17 18 19 20 21

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe n (número de linhas): ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            System.out.println(i);
            System.out.print(i++);
            System.out.println(i++);


        }


        // sc.close();


    }

}
