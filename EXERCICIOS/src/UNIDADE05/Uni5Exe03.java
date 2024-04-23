package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe03 {
    public static void main(String[] args) {
        //AJUDADO
        //Descreva um algoritmo que calcula e escreva a soma da seguinte série de 100 termos:
        // 1/1 + 1/2 + 1/3 + 1/4 + ... 1/100

        Scanner sc = new Scanner(System.in);

        double soma = 0;

        for(int i = 1; i <= 100; i++){
            double termo = 1 / i;
            soma += termo;
        }
        
        System.out.printf("A soma da série é: %f", soma);



        // sc.close();
    }

}
