import java.util.Scanner;

public class ExtrasExe01 {
    public static void main(String[] args) {
        //Escreva um algoritmo que lê um horário (hora, minuto, segundo) e determina quantos segundos se passaram desde que o dia começou
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe as horas: ");
        int horas = sc.nextInt();

        System.out.print("Informe os minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Informe os segundos: ");
        int segundos = sc.nextInt();

        int qtdSegundos = horas * 3600 + minutos * 60 + segundos;

        System.out.printf("%d segundos se passaram desde que o dia começou",qtdSegundos);

        sc.close();




    }

}
