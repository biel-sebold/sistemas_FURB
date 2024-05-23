package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        //Escreva um programa que imprime um calendário para um determinado mês. O calendário deve conter cada dia do mês e o dia da semana correspondente. A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro especificando o número de dias que o mês possui.
        // Exemplo: p = 3 n = 31

        Scanner sc = new Scanner(System.in);

        System.out.print("(1) DOMINGO | (2) SEGUNDA | (3) TERÇA | (4) QUARTA | (5) QUINTA | (6) SEXTA | (7) SÁBADO" + "Informe quando cai o primeiro dia do mês: ");
        int dia = sc.nextInt();

        System.out.print("Informe quantos dias o mês possui: ");
        int mes = sc.nextInt();
    }

}
