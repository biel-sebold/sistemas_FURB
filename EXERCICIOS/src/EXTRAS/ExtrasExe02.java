package EXERCICIOS.src.EXTRAS;

import java.util.Scanner;

public class ExtrasExe02 {
    public static void main(String[] args) {
        //Adapte o algoritmo do exercício 1 para determinat também quantos segundos faltam até odia terminar

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe as horas: ");
        int horas = sc.nextInt();

        System.out.print("Informe os minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Informe os segundos: ");
        int segundos = sc.nextInt();

        int qtdSegundos = horas * 3600 + minutos * 60 + segundos;
        int segundosFal = 86400 - qtdSegundos;

        System.out.printf("%d segundos se passaram desde que o dia começou, e faltam %d segundos para ele acabar", qtdSegundos, segundosFal);

        sc.close();
    }

}
