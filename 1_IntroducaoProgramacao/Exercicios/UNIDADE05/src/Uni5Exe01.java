import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
       //DANTON
       //Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

        Scanner sc = new Scanner(System.in);   

        for(int i = 1; i <= 20; i++){
            System.out.printf("Informe o número %d: ", i);          
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Número par\n\n");
                
            } else{
                System.out.println("Número ímpar\n\n");
            }

            // System.out.printf("O número %d é %s%n", i, numero % 2 == 0 ? "par" : "ímpar");//USOU TERNÁRIOS
        }

        sc.close();
    }

}
