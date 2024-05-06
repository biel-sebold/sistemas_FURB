package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        //Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do aluno 1 (fim termina): ");
        String nome = sc.nextLine();

        System.out.print("Informe a nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.print("Informe a nota 2: ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;
        System.out.printf("Aluno 1: média = %.1f\n\n", media);

        int contador = 1;

        while (!nome.equalsIgnoreCase("fim")) {

            contador++;
            System.out.printf("Informe o nome do aluno %d (fim termina):", contador);
            nome = sc.next();

            System.out.print("Informe a nota 1: ");
            nota1 = sc.nextFloat();
            System.out.print("Informe a nota 2: ");
            nota2 = sc.nextFloat();
            media = (nota1 + nota2) / 2;
            System.out.printf("Aluno %d: média = %.1f\n\n", contador, media);
            
        }

        System.out.println("fim");

        sc.close();
    }

}
