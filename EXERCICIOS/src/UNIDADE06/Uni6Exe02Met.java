package EXERCICIOS.src.UNIDADE06;

import java.util.Scanner;

//Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média.

public class Uni6Exe02Met {

    private Uni6Exe02Met() {
        Scanner sc = new Scanner (System.in);

        double valores[] = new double[12];
        leia(sc, valores);
        double media = calculaMedia(valores);
        acimaDaMedia(valores, media);

    }

    private void leia(Scanner s, double vetor[]) {

        System.out.println("**** LEITURA DO VETOR ****");

        for(int i = 0; i < vetor.length; i++) {

            System.out.printf("Valor %d: ", i + 1);
            vetor[i] = s.nextDouble();
        }
    }

    private void acimaDaMedia(double vetor[], double media) {

        System.out.printf("**** VALORES ACIMA DA MÉDIA: %.2f ****\n", media );

        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.printf("Posição %d ---> Valor %.2f\n", i + 1, vetor[i]);
            }
        }

    }

    private double calculaMedia(double vetor[]) {
        double acumula = 0;
        for(int i =0; i < vetor.length; i++) {
            acumula += vetor[i];
        }

        return acumula / vetor.length;
    }

    public static void main(String[] args) {
        
    }

}
