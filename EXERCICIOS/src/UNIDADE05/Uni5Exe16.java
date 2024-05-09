package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        //Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Informe o gênero (M ou F ou O): ");
        String entrada = sc.nextLine();
        char genero = entrada.toLowerCase().charAt(0);

        if (altura == 0) {

            



            
        }
       

        double media;
        int contador = 0;


        while (altura != 0) {

            System.out.print("Informe a altura: ");
            altura = sc.nextDouble();
            contador += altura;

            System.out.print("Informe o gênero (M ou F ou O): ");
            entrada = sc.nextLine();
            genero = entrada.toLowerCase().charAt(0);


            
        }

        

        



        sc.close();
    }

}
