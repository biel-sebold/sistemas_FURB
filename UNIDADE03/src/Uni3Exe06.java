package EXERCÍCIOS.UNIDADE03;

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        //Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o peso do prato: ");
        double peso = sc.nextDouble();
        double preço = (25 * peso) / 1000;

        System.out.printf("O valor a pagar será de R$%.2f", preço);




    }
    
}
