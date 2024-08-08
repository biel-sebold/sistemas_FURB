package src;

import java.util.Scanner;

public class SomaComLeitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int x = A + B;

//EXEMPLO1
       // System.out.println("A soma é " + x);

//EXEMPLO2  concatenação     
       String.format("A soma de %d com %d é: %d", A, B, x);

//EXEMPLO3 concatenação        
       // System.out.printf("A soma de %d com %d é: %d%n", A, B, x);
       // System.out.println("Terminei!!!");

       teclado.close();
    }
    
}
