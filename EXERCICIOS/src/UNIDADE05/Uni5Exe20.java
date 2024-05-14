package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        //Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.

        Scanner sc = new Scanner(System.in);

        int tSegundos = 0;
        double massaFinal = 0;

        System.out.print("Informe a massa inicial (kg): ");
        double massa = sc.nextDouble();

        while (massaFinal >= 0.5) {
           tSegundos+=50;
           massaFinal = massa / 2;
            
        }

        // int horas = tSegundos / 3600;
        // int minutos = (tSegundos % 3600) / 60;
        // int segundos = tSegundos % 60;

        System.out.printf("MASSA INICIAL: %.1f\n", massa);
        System.out.printf("MASSA FINAL: %.1f\n", massaFinal);
        // System.out.printf("TEMPO: %02d:%02d:%02d", horas, minutos, segundos);
        System.out.printf("TEMPO: %d", tSegundos);

        // sc.close();
    }

}
