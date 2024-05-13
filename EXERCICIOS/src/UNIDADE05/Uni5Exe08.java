package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        //Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
        // escreva o menor valor negativo;
        // escreva a média dos números positivos.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números: ");
        int n = sc.nextInt();

        int menorNeg = Integer.MIN_VALUE;
        double media = 0;
        int numeroNeg;
        int soma = 0;

        for(int i = 1; i <= n; i++){

           System.out.printf("Informe o número %d: ", i);
           int numero = sc.nextInt();

           if (numero < 0) {
                numero = menorNeg;
            
           } else if (numero > 0) {
                soma+=numero;
                media = soma; 
            
           }
        }

        System.out.printf("MENOR VALOR NEGATIVO: %d%nMÉDIA DOS POSITIVOS: %d", menorNeg, media);

        sc.close();
    }

}
