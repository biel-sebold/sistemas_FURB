package EXERCICIOS.src.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
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


        switch (opcao) {
            case 1:
            if (valor1 > valor2 && valor2 > valor3 || valor2 > valor1 && valor1 > valor3) {
                System.out.print(valor1);
                System.out.print(valor2);
                System.out.print(valor3);
                
            } else if () {
                
            }
                break;
            case 2:
                break;
            case 3:
                break;
        
            default:
                break;
        }



        sc.close();
    }

}
