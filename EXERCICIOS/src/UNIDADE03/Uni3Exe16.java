package EXERCÍCIOS.UNIDADE03;

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        //AJUDADO//
        //Suponha que uma caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que a caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da compra: R$");
        double compra = sc.nextDouble();

        System.out.print("Informe o valor pago : R$");
        double pago = sc.nextDouble();

        double troco = pago - compra;

        //calculando número de notas 100, 10 e 1

        double notas100 = troco / 100;
        troco %= 100;

        double notas10 = troco / 10;
        troco %= 10;

        double notas1 = troco;

        System.out.print("NÚMERO MÍNIMO DE NOTAS QUE O CAIXA DEVE OFERECER COMO TROCO\n");
        System.out.printf(" Nota(s) de 100: %.0f\n Nota(s) de 10: %.0f\n Nota(s) de 1: %.0f",
                                  notas100, notas10, notas1);
                





    }
    
}
