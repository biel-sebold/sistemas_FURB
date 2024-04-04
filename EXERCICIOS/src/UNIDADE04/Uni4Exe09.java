package EXERCICIOS.src.UNIDADE04;
import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        //AJUDADO//
        //Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Informe outro número inteiro: ");
        int n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Os números são múltiplos");
            
        } else{
            System.out.println("Os números não são múltiplos");
        }


    }
    
}
