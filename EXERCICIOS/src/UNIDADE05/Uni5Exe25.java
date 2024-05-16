package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        //Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:

        // um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
        // o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.

        Scanner sc = new Scanner(System.in);

        int pontosD = 0;
        int pontosE = 0;
        int diferenca = pontosD - pontosE;

        while (pontosD < 20 || pontosE < 20 && diferenca <= 2) {
            System.out.print("Informe quem pontuou na rodada:");
            
            
        }
    }

}
