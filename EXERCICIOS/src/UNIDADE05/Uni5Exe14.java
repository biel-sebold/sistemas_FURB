package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        //Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

        // escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;

        // determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.

        Scanner sc = new Scanner(System.in);

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        double vcTotal = 0;
        double vvTotal = 0;

        for(int i = 1; i <= 2; i++) {

            System.out.print("\nInforme o nome: ");
            String nome = sc.next();
            System.out.print("Informe o preço de compra: R$");
            double pc = sc.nextDouble();
            System.out.print("Informe o preço de venda: R$");
            double pv = sc.nextDouble();

            double lucro = (pv - pc) / pc * 100;

            if (lucro < 10) {
                contador1++;
                
            } else if (lucro <= 20) {
                contador2++;

            } else {
                contador3++;
            }

            vcTotal += pc; //AJUDADO
            vvTotal += pv; //AJUDADO

        }

        double lucroTotal = vvTotal - vcTotal; //AJUDADO

        System.out.printf("\n%d mercadorias proporcionaram lucro menor de 10%%\n", contador1);
        System.out.printf("%d mercadorias proporcionaram lucro entre 10%% e 20%%\n", contador2);
        System.out.printf("%d mercadorias proporcionaram lucro maior de 20%%\n\n", contador3);

        System.out.printf("VALOR TOTAL DE COMPRA = R$%.2f\n", vcTotal);
        System.out.printf("VALOR TOTAL DE VENDA = R$%.2f\n", vvTotal);
        System.out.printf("LUCRO TOTAL = R$%.2f", lucroTotal);



        sc.close();


    }
}
