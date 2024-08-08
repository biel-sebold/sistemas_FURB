import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        //Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do aluno 1 (fim termina): ");
        String nome = sc.nextLine();

        int contador = 1;

        while (!nome.equalsIgnoreCase("fim")) {

            contador++;

            System.out.print("Informe a nota 1: ");
            float nota1 = sc.nextFloat();
            System.out.print("Informe a nota 2: ");
            float nota2 = sc.nextFloat();
            float media = (nota1 + nota2) / 2;
            System.out.printf("Aluno %d: média = %.1f\n\n", contador, media);

            System.out.printf("Informe o nome do aluno %d (fim termina):", contador);
            nome = sc.next();
            
        }

        sc.close();
    }

}
