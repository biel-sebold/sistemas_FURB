package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        //BELLETTI
        //Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:

        // um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
        // o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.

        Scanner sc = new Scanner(System.in);

        int direito = 0;
        int esquerdo = 0;
        int diferencaF = 0;

        while (direito < 5 && esquerdo < 5 || diferencaF < 2) {
            System.out.print("\nInforme quem pontuou na rodada:");
            String pontos = sc.next();

            switch (pontos.toUpperCase().charAt(0)) {
                case 'D':
                    direito++;
                    break;

                case 'E':
                    esquerdo++;
                    break;
            
                default:
                    System.out.print("DADO INVÁLIDO");
                    break;
            }

            System.out.println("\n*****PLACAR****\n ");
            System.out.printf("LADO DIREITO: %d\n", direito);
            System.out.printf("LADO ESQUERDO: %d\n", esquerdo);

            int diferencaI = direito - esquerdo;
            diferencaF = diferencaI;

            if (diferencaI < 0) {
                diferencaF = diferencaI * (-1);
                
            }
            System.out.println(diferencaF);
            
        }

        sc.close();
    }

}
