package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        //Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi coletado o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada casa só existia uma televisão. Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência.

        //A leitura deve ser finalizada quando for informado canal 0.

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe quantas casas foram visitadas: ");
        int casas = sc.nextInt();

        System.out.print("Informe o número do canal (se desligada informar 'zero'): ");    
        String canal = sc.next().toLowerCase();

        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;

        int mediaP = 0;
        int soma = 0;

        while (canal != "0") {

            System.out.println("Informe o número de pessoas assistindo a TV (se desligada informar '0'): ");
            int pessoas = sc.nextInt();         

            if (canal == "4") {
                canal4++;
                
            } else if (canal == "5") {
                canal5++;
                
            } else if (canal == "9") {
                canal9++;
                
            } else if (canal == "12") {
                canal12++;                
            }
            
        }

        sc.close();
    }

}
