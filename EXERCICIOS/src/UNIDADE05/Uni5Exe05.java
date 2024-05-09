package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        //DANTON
        //Descreva um algoritmo que escreve os n primeiros termos da seguinte sequência de números:
        //8, 10, 16, 18, 32, 34, 64...

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe n (n > 2): ");
        int n = sc.nextInt();

        int num = 8;
        // int soma = 0;

        for(int i = 2; i <= n; i++) {

           System.out.printf("%d, %d, ", num, num + 2); //(8, 10)

           //soma = soma + num + (num + 2);      
           //(FAZ A SEQUÊNCIA E VAI ALTERANDO A CADA FOR, ESCREVE NO INÍCIO DE CADA FOR)
           num *= 2;

        }

        sc.close();


    }

}
