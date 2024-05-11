package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        //Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a massa inicial (kg): ");
        double massa = sc.nextDouble();

        while (massa < 0.5) {
           System.out.println("oi");
            
        }

        // sc.close();
    }

}
