package EXERCICIOS.src.UNIDADE06;

import java.util.Scanner;

//Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos. FAÇA UM MÉTODO PARA LER E OUTRO PARA ESCREVER.

public class Uni6Met01 {
    private Uni6Met01() {

        Scanner sc = new Scanner(System.in);
        int valores[] = new int [10];
        leia(sc, valores);
        escreva(valores);
        sc.close();

    }

    private void leia(Scanner s, int vetor[]) {
        for( int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o número %d: ", i + 1);
            vetor[i] = s.nextInt();
        }
    }

    private void escreva(int vetor[]) {
        System.out.println("\n***** MOSTRANDO VALORES *****");

        for(int i = vetor.length - 1; i >= 0; i--) {
            System.out.printf("Posição %d --> valor %d\n", i + 1, vetor[i]);
        }
    }
    public static void main(String[] args) {
        new Uni6Met01();
    }

}
