package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        //Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi coletado o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada casa só existia uma televisão. Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência.

        //A leitura deve ser finalizada quando for informado canal 0.

        Scanner sc = new Scanner (System.in);

        int total = 0;

        int canal4 = 0;
        int pessoas4 = 0;
        int canal5 = 0;
        int pessoas5 = 0;
        int canal9 = 0;
        int pessoas9 = 0;
        int canal12 = 0;
        int pessoas12 = 0;

        System.out.print("Informe quantas casas foram visitadas: ");
        int casas = sc.nextInt();

        System.out.print("\nInforme o número do canal (se desligada informar 'zero'): ");    
        String canal = sc.next().toLowerCase();

        for(int i = 0; i <= casas; i++) {

        while (canal != "0") {

            if (canal == "zero") {
                continue;            
            }

            System.out.print("Informe o número de pessoas assistindo a TV (se desligada informar 'zero'): ");
            int pessoas = sc.nextInt();   
            
            switch (canal) {
                case "4":
                canal4++;
                pessoas4++;
                total++;                  
                    break;

                case "5":
                canal5++;
                pessoas5++;
                total++;                          
                    break;

                case "9":
                canal9++;
                pessoas9++;
                total++;                         
                    break;

                case "12":
                canal12++; 
                pessoas12++;
                total++;                             
                    break;

                case "zero":
                System.out.println("TV DESLIGADA");                                           
                    break;
            
                default:
                System.out.println("CANAL INEXISTENTE");
                    break;
            }

            System.out.print("\nInforme o número do canal (se desligada informar 'zero'): ");    
            canal = sc.next().toLowerCase();
      
        }
    }

            System.out.println("PERCENTUAIS DE AUDIÊNCIA: \n");

            double audiencia4 = (pessoas4/total) * 100;
            System.out.printf("Canal 4: %.1f%%", audiencia4);
            double audiencia5 = (pessoas5/total) * 100;
            System.out.printf("Canal 5: %.1f%%", audiencia5);
            double audiencia9 = (pessoas9/total) * 100;
            System.out.printf("Canal 9: %.1f%%", audiencia9);
            double audiencia12 = (pessoas12/total) * 100;
            System.out.printf("Canal 12: %.1f%%", audiencia12);

            sc.close();   
        }
    }


