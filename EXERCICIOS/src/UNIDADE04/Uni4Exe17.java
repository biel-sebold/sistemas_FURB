package EXERCICIOS.src.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        //Para efetuar o cálculo do Imposto de Renda a Ser Pago, é solicitado o rendimento anual e o número de dependentes do contribuinte. A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte. O imposto com uma renda líquida de até R$ 2.000,00 não paga imposto. Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00 pagam 15% de imposto.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o rendimento anual: R$ ");
        double rendimento = sc.nextInt();

        System.out.print("Informe o número de dependentes do contribuinte: ");
        int dependentes = sc.nextInt();

        double rendaLiq = (rendimento * 0.02) / dependentes;
        double imposto;

        if (rendaLiq < 2000) {
            imposto = 0;

        } else if (rendaLiq > 2000 && rendaLiq < 5000) {
            imposto = rendaLiq * 0.05;
            
        } else if (rendaLiq > 5000 && rendaLiq < 10000) {
            imposto = rendaLiq * 0.10;

        } else {
            imposto = rendaLiq * 0.15;
        }

        System.out.printf("O valor de imposto a ser pago será: %.2f", imposto);

        sc.close();


    }

}
