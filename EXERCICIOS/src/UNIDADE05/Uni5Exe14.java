package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        //Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

        // escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;

        // determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = sc.next();
        System.out.print("Informe o preço de compra: R$");
        double pc = sc.nextDouble();
        System.out.print("Informe o preço de venda: R$");
        double pv = sc.nextDouble();

        double lucro = (pv - pc) / pc * 100;


        for(int i = 1; i <= 20; i++) {

            System.out.print("\nInforme o nome: ");
            nome = sc.next();
            System.out.print("Informe o preço de compra: R$");
            pc = sc.nextDouble();
            System.out.print("Informe o preço de venda: R$");
            pv = sc.nextDouble();
            

        }

        sc.close();


    }
}
