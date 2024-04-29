package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        //Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
        // escreva o menor valor negativo;
        // escreva para a média dos números positivos.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números: ");
        int n = sc.nextInt();

        int menorNeg = Integer.MAX_VALUE;
        double media = 0;
        int numeroNeg = 0;

        for(int i = 1; i <= n; i++){

           System.out.printf("Informe o número %d: ", i);
           int numero = sc.nextInt();

           if (numero < 0) {
                numeroNeg = menorNeg;
            
           } else if (numero > 0) {
                media = numero / n; 
            
           }
        }

        System.out.printf("MENOR VALOR NEGATIVO: %d%nMÉDIA DOS POSITIVOS: %d", numeroNeg, media);

        // sc.close();
    }

}
