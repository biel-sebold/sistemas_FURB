package EXERCICIOS.src.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        //DIAGRAMA//
        //Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia = sc.nextInt();

        System.out.println("Informe o mês: ");
        int mes = sc.nextInt();

        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {

            
        } els{
            System.out.println("Data Inválida");
        }
    }
    
}
