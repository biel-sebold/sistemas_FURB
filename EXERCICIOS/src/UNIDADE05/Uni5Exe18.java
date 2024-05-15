package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        //DANTON
        //Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi coletado o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada casa só existia uma televisão. Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência.

        //A leitura deve ser finalizada quando for informado canal 0.

        Scanner sc = new Scanner (System.in);

        int pessoas4 = 0;
        int pessoas5 = 0;
        int pessoas9 = 0;
        int pessoas12 = 0;
        int total = 0;
        int assistindo = 0;

        System.out.print("\nInforme o canal (se desligada digitar '0'): ");    
        int canal = sc.nextInt();

        while (canal != 0) {

            System.out.print("Informe quantas pessoas estão assistindo: ");
            assistindo = sc.nextInt();

            total += assistindo;
            
            switch (canal) {
                case 4:
                    pessoas4 += assistindo;                
                    break;
                
                case 5:
                    pessoas5 += assistindo;                
                    break;
                
                case 9:
                    pessoas9 += assistindo;                                       
                    break;

                case 12:
                    pessoas12 += assistindo;                                           
                    break;
            
                default:
                    System.out.println("CANAL INVÁLIDO");
                    total -= assistindo;
                    break;
            }

            System.out.print("\nInforme o canal (se desligada digitar '0'): ");    
            canal = sc.nextInt();
        }

        if (total > 0) {
            System.out.println("*****AUDIÊNCIA***** \n");
            System.out.printf("Canal 4: %.1f%%\n", (pessoas4 / (double) total * 100));   
            System.out.printf("Canal 5: %.1f%%\n", (pessoas5 / (double) total * 100));   
            System.out.printf("Canal 9: %.1f%%\n", (pessoas9 / (double) total * 100)); 
            System.out.printf("Canal 12: %.1f%%\n", (pessoas12 / (double) total * 100));    
            
        }

       
        sc.close();   
        }
}
    


