package EXERCICIOS.src.UNIDADE04;
import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
    //AJUDADO//    
    //Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”, caso a resposta seja verdadeira, ou “Não”, caso seja falsa.

    Scanner sc = new Scanner(System.in);

    System.out.println("A cor é azul? (Digite 'Sim' ou 'Não'):");
        String resposta = sc.nextLine().toLowerCase();

        if (resposta.equals("sim")) {
            System.out.println("Sim");
        } else if (resposta.equals("não") || resposta.equals("nao")) {
            System.out.println("Não");
        } else {
            System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
        }




    
}
}