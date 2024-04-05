package EXERCICIOS.src.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade do homem 1: ");
        int homem1 = sc.nextInt();
        System.out.print("Informe a idade do homem 2: ");
        int homem2 = sc.nextInt();

        System.out.print("Informe a idade da mulher 1: ");
        int mulher1= sc.nextInt();
        System.out.print("Informe a idade da mulher 2: ");
        int mulher2 = sc.nextInt();

        int soma;
        int produto;

        if (homem1 > homem2 && mulher1 < mulher2) {
            soma = homem1 + mulher1;
            produto = homem2 * mulher2;
            System.out.printf("A soma das idades será %d e  o produto %d", soma, produto);
            
        } else if (homem1 < homem2 && mulher1 < mulher2) {
            soma = homem2 + mulher1;
            produto = homem1 * mulher2;
            System.out.printf("A soma das idades será %d e o produto %d", soma, produto); 
            
        } else if (homem1 > homem2 && mulher1 > mulher2) {
            soma = homem1 + mulher2;
            produto = homem2 * mulher1;
            System.out.printf("A soma das idades será %d e  o produto %d", soma, produto);
    
        } else{
            soma = homem2 + mulher2;
            produto = homem1 * mulher1;
            System.out.printf("A soma das idades será %d e  o produto %d", soma, produto);
        }    

        sc.close();

    }
}