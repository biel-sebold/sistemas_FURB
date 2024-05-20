package EXERCICIOS.src.UNIDADE06;

import java.util.Scanner;

public class Uni6Exe01 {

    public static void main(String[] args) {
        //DANTON
        //Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.
        Scanner sc = new Scanner(System.in);

        int valores[] = new int[10];

        for(int i = 0; i < valores.length; i++) {
            System.out.printf("Informe o número %d: ", i + 1);
            valores[i] = sc.nextInt();
           
        }

        System.out.println("\n***** MOSTRANDO VALORES *****");

        for(int i = valores.length - 1; i >= 0; i--) {
            System.out.printf("Posição %d --> valor %d\n", i + 1, valores[i]);
        }

        sc.close();
    }

}
