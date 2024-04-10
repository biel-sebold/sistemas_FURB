package EXERCICIOS.src.EXTRAS;

import java.util.Scanner;

public class ExtrasExe03 {
    public static void main(String[] args) {
        //Escreva um algoritmo para ler um tempo em segundos, e depois escrevê-lo em horas, minutos, segundos

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tempo total em segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int restSegundos = segundos % 60;

        System.out.printf("%dh %dm %ds", horas, minutos, restSegundos);

        sc.close();
    }

}
