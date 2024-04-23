package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args) {
        //Descreva um algoritmo para calcular o valor de S dado por:
        // S= 3/2 + 5/6 + 7/12 + 9/20 + 11/30 + ...
        // Considere os 20 primeiros termos da série.

        Scanner sc = new Scanner(System.in);

        int denominador = 2;
        double soma = 0;

        for(int i = 1; i <= 20; i++){
            int numerador = 2 * i + 1;
            double termo = (double) numerador / denominador;
            soma += termo;
            denominador += i + 1;
        }

        System.out.printf("A soma é: %f", soma);

        // sc.close();


    }

}
