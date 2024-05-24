package EXERCICIOS.src.UNIDADE06;

import java.util.Scanner;
//DANTON
//Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.

public class Uni6Exe04 {
    private Uni6Exe04() {
        Scanner sc = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorSoma[] = new int[10];
        leia(sc, vetor1, "V1");
        leia(sc, vetor2, "V2"); 
        imprimir(vetor1, "V1");
        imprimir(vetor2, "V2");
        imprimir(somaVetor(vetor1, vetor2), "Soma");

    }

    private void leia(Scanner s, int vetor[], String nomeVetor) {
        System.out.printf("*** LENDO VETOR: %s ***\n", nomeVetor);

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: ", i + 1);
            vetor[i] = s.nextInt();
    
        }
    }

    private int[] somaVetor(int v1[], int v2[]) {
        int soma[] = new int[v1.length];

        for(int i = 0; i < v1.length; i++) {
            soma[i] = v1[i] + v2[i];
        }
        return soma;
    }

    private void imprimir(int vetor[], String nomeVetor) {
        System.out.printf("*** IMPRIMINDO VETOR %s ***\n", nomeVetor);
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%d, ", vetor[i]);
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }

}
