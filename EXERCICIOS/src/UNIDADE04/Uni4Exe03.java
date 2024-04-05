package EXERCICIOS.src.UNIDADE04;
import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        //Dados dois números inteiros descrevem um algoritmo para informar o maior valor entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n1 = sc.nextInt();

        System.out.print("Informe outro número: ");
        int n2 = sc.nextInt();


        // String maior = (n1 == n2 ? "iguais" : n1 > n2 ? "n1 maior" : "n2 maior");
        // System.out.println(maior);

        
        // if (n1 != n2) {
            if (n1 > n2) {
                System.out.printf("n1: %d é maior que n2: %d", n1, n2);
            
            } else {
                System.out.printf("n2: %d é maior que n1: %d", n2, n1);
            }
        // } else{
        //     System.out.println("Os números n1 e n2 são iguais");
        // }  

        // if (n1 == n2) {
        //     System.out.println("Os números n1 e n2 são iguais");
            
        // } else if(n1 > n2) {
        //     System.out.printf("n1: %d é maior que n2: %d", n1, n2);
            
        // } else{
        //     System.out.printf("n2: %d é maior que n1: %d", n2, n1);
                
        //     }

        sc.close();
       } 

     }

