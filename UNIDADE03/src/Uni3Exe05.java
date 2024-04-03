package EXERCÍCIOS.UNIDADE03;

import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        //Uma granja possui um controle automatizado de cada frango de sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos frangos estão na granja: ");
        int frangos = sc.nextInt();

        double anelChip = 4;
        double anelAlimento = 7;

        double gasto = (frangos * anelChip) + (frangos * anelAlimento);
        //double gasto = frangos * 11;

        System.out.printf("O gasto total com %d frangos na granja foi de R$%.2f", frangos, gasto);



    }

    
}
