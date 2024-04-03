package EXERCÍCIOS.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        //Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número > 0: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("NÚMERO INVÁLIDO:\n\s- Precisa ser maior > 0\n\s- Tente novamente"); 
            
        } else{
            if (num % 2 == 0) {
                System.out.println("Número é par");

            } else{
                System.out.println("Número é ímpar");
            }
        }
    }
    
}
