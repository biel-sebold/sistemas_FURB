package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        //Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.

        Scanner sc =  new Scanner(System.in);

        double total = 0;
        double peso = 0;
        String entrada = "";

        System.out.print("Informe o limite diário (em quilogramas): ");
        double limite = sc.nextDouble();

        while (!entrada.equalsIgnoreCase("n")) {

            System.out.print("Informe o peso (em gramas): ");
            peso = sc.nextDouble();

            total += peso;
  
            if (total / 1000 > limite) {
                System.out.println("LIMITE DIÁRIO EXCEDIDO");
                break;          
            }

            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            entrada = sc.next();

            System.out.printf("\nPESO TOTAL DA PESCA: %.2f kg\n", (total / 1000));

            }
            
            sc.close();
        }
    }
