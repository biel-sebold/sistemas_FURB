package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        //Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.

        Scanner sc =  new Scanner(System.in);

        int total = 0;
        double peso = 0;
        String entrada = "";

        System.out.print("Informe o limite diário (em quilogramas): ");
        double limite = sc.nextDouble();

        while (limite > total || !entrada.equalsIgnoreCase("n")) {
            System.out.print("\nInforme quantos peixes foram pescados: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {

            System.out.print("Informe o peso (em gramas): ");
            peso = sc.nextDouble();

            total += peso;
            }

            System.out.printf("\nPESO TOTAL DA PESCA: %dg\n", total);

            System.out.print("\nDeseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            entrada = sc.next();

        }

        if (total > limite) {
            System.out.println("LIMITE DIÁRIO EXCEDIDO");
        }

        // sc.close();
    }

}
