package src;

import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o número inteiro...: ");
        int numero1 = teclado.nextInt();
        System.out.println("Informe um número real....: ");
        float valorReal = teclado.nextFloat();
        System.out.println("O valor inteiro é: " + numero1);
        System.out.println("O valor real é: " + valorReal);

        teclado.close();
        

    }
    
}
