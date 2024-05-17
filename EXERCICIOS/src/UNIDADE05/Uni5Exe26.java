package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        //Astolfo resolveu fazer uma viagem para conhecer o nosso país. Ele pretende visitar várias cidades, dividindo assim a viagem em vários trechos. Entretanto Astolfo se nega a passar por estradas cujo custo do pedágio exceda um determinado valor. Faça um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega a pagar. A seguir leia várias duplas de valores representando respectivamente o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:

        // quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo nega­se a pagar;
        // quantos trechos foram informados;
        // quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar.
        // OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo. Neste caso a leitura da distância não deve ser executada. Os resultados devem ser impressos no final do programa.

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o valor negado/máximo: ");
        double maximo = sc.nextDouble();

        System.out.print("\nInforme o custo do 1º pedágio: ");
        double pedagio = sc.nextDouble();

        int i = 1;
        int contadorP = 0;
        int total = 0;
        int trecho150 = 0;

        while (pedagio >= 0) {
            System.out.printf("Informe a distância do %dº trecho: ", i );
            double distancia = sc.nextDouble();

            if (pedagio > maximo) {
                contadorP++;
                total++;
                     
            } else if (distancia > 150 && pedagio < maximo) {
                trecho150++;
                total++;
                
            } else {
                total++;
            }

            i++;

            System.out.printf("\nInforme o custo do %dº pedágio: ", i);
            pedagio = sc.nextDouble();
 
        }

        System.out.printf("\n\nTRECHOS COM VALOR ACIMA DO QUAL ELE NEGA-SE A PAGAR: %d\n", contadorP);
        System.out.printf("QUANTIDADE DE TRECHOS INFORMADOS: %d\n", total);
        System.out.printf("TRECHOS ACIMA DE 150KM ACEITOS: %d", trecho150);

        sc.close();
    }

}
