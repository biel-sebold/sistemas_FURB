package EXERCICIOS.src.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        //AJUDADO//
        // Dados 3 valores, escreva um algoritmo que os informa em uma determinada ordem a partir de um menu de opções:
// se opção = 1, escreva os 3 valores em ordem crescente
// se opção = 2, escreva os 3 valores em ordem decrescente
// se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        float valor1 = sc.nextFloat();

        System.out.print("Informe o segundo valor: ");
        float valor2 = sc.nextFloat();

        System.out.print("Informe  o terceiro valor: \n");
        float valor3 = sc.nextFloat();

        System.out.println("Escolha uma das 3 opções: ");
        System.out.println("1- Ordem crescente.\n2- Ordem decrescente.\n3- O maior valor ficar no meio");

        int opcao = sc.nextInt();
        float primeiro;
        float segundo;
        float terceiro;

        if (valor1 > valor2 && valor1 > valor3) {
            primeiro = valor1;
        if (valor2 > valor3) {
            segundo = valor2;
            terceiro = valor3;
            
        } else{
            segundo = valor3;
            terceiro = valor2;

        }
            
        } else if (valor2 > valor1 && valor2 > valor3) {
            primeiro = valor2;
        if (valor1 > valor3) {
            segundo = valor1;
            terceiro = valor3;

            
        } else{
            segundo = valor3;
            terceiro = valor1;

        }
        } else {
            primeiro = valor3;
            if (valor1 > valor2) {
                segundo = valor1;
                terceiro = valor2;
                
            } else{
                segundo = valor2;
                terceiro = valor1;
            }
            
        }   

        switch (opcao) {
            case 1:
                System.out.printf("A ordem será: %.1f, %.1f, %.1f\n", terceiro, segundo, primeiro);
                System.out.println("Ordem Crescente");
            break;

            case 2:
                System.out.printf("A ordem será: %.1f, %.1f, %.1f\n", primeiro, segundo, terceiro);
                System.out.println("Ordem decrescente");
            break;

            case 3:
                System.out.printf("A ordem será: %.1f, %.1f, %.1f\n", segundo, primeiro, terceiro);
                System.out.println("O maior fica no meio");
            break;
        
            default:
                System.out.println("Opção inválida");
            break;
        }



        sc.close();
    }

}
