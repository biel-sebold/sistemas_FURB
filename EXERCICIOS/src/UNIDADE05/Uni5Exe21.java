package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe21 {
    public static void main(String[] args) {
        //Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.

        Scanner sc = new Scanner(System.in);

        int anos = 0;
        int alturaZ = 110;
        int alturaC = 150;

        while (alturaC > alturaZ) {

            alturaC+=2;
            alturaZ+=3;
            anos++;
        }

        System.out.printf("Serão necessários %d anos para que Zé seja maior que Chico", anos);

        sc.close();
    }

}
