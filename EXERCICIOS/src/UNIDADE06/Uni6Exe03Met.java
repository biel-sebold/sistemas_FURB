package EXERCICIOS.src.UNIDADE06;

import java.util.Scanner;

public class Uni6Exe03Met {

    private Uni6Exe03Met() {
        Scanner sc = new Scanner(System.in);
        double valores[] = new double[12];
        leia(sc, valores);
        ajustar();
        imprimir();

    }

    private void leia(Scanner sc, double vetor[]) {
        System.out.println("**** LEITURA DO VETOR ****");

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Valor %d: ", i + 1);
            vetor[i] = sc.nextDouble();
        }
    }

    private void ajustar(double vetor[]) {
        for(int i = 0; i < vetor.length; i++) {
            if ((i + 1) % 2 == 0) {
                vetor[i] += vetor[i] * 0.02;
            } else {
                vetor[i] += vetor[i] * 0.05;
            }
        }
    }

    private void imprimir(double vetor[]) {
        System.out.println("*** IMPRIMIR VETOR ***");

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d ---> valor %.2f\n", i + 1, vetor[i]);
        }
    }
    public static void main(String[] args) {
        new Uni6Exe03Met();
        
    }
}
