package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        //Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 
        //1.5%. A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.

        Scanner sc = new Scanner(System.in);

        int anoAtual = 2024;
        double salarioInicial = 2000.00;
        int ano = 1996;
        double aumento = 0.015;

        while (ano <= anoAtual) {   
            aumento *= 2;
            salarioInicial *= (1 + aumento); 
            //Se não adicionar 1 ao aumento percentual, estaria apenas multiplicando o salário pelo aumento
            ano++;

        }

        System.out.printf("O salário atual do funcionário é: R$ %.2f", salarioInicial);

        // sc.close();
    }

}
