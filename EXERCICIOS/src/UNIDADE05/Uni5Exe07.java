package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        //AJUDADO
        //Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de números: ");
        int n = sc.nextInt();

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
       
        for (int i = 1; i <= n; i++){

            System.out.printf("Digite o número %d: ", i);
            double numero = sc.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }


        }

        System.out.printf("MAIOR: %f%nMENOR: %.1f", maior, menor);

        sc.close();
    }

}
