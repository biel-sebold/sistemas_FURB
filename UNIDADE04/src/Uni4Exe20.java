import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        //PROFESSOR// (ESCOPO DE VARIÁVEIS)
        //Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo que calcula a média de aproveitamento e o conceito do aluno, usando a fórmula:
        // media=(notaProva1+notaProva2*2+notaProva3*3+notaExercícios)/7

        // A atribuição dos conceitos obedece à tabela abaixo:
        // >= 9,0	        (A)
        // >= 7,5 e < 9,0	(B)
        // >= 6,0 e < 7,5	(C)
        // >= 4,0 e < 6,0	(D)
        // < 4,0         	(E)

        // O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota prova 1: ");
        float nota1 = sc.nextFloat();

        System.out.print("Nota prova 2: ");
        float nota2 = sc.nextFloat();

        System.out.print("Nota prova 3: ");
        float nota3 = sc.nextFloat();

        System.out.print("Nota exercícios: ");
        float notaExe = sc.nextFloat();

        float media = ((nota1 + nota2 * 2) + (nota3 * 3) + notaExe) / 7

        char conceito = ' ';
        if (media >= 9.0) {
            conceito = 'A';
            
        } else if (media >= 7.5 && < 9.0) {
            conceito = 'B';

        } else if (media >= 6.0 && < 7.5) {
            conceito = 'C';
        
        } else if (media >= 4.0 && < 6.0) {
            conceito = 'D';
            
        } else{
            conceito = 'E';
        }


        String situacao = " ";
        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            situacao = "APROVADO";
            
        } else{
            situacao = "REPROVADO";
        }

        System.out.printf("A média é: %.1f com conceito %c e situação %s.", media, conceito, situacao );






        //MODO RÁPIDO// (OVERHEAD)

        // if (media >= 9) {
        //     conceito = 'A';
            
        // } else if (media >= 7.5) {
        //     conceito = 'B';

        // } else if (media >= 6) {
        //     conceito = 'C';
        
        // } else if (media >= 4) {
        //     conceito = 'D';
            
        // } else{
        //     conceito = 'E';
        // }


        // String situacao = " ";
        // if (media >= 6) {
        //     situacao = "APROVADO";
            
        // } else{
        //     situacao = "REPROVADO";
        // }

        // System.out.printf("A média é: %.1f com conceito %c e situação %s.", media, conceito, situacao );


       


    
    
        }


    }
