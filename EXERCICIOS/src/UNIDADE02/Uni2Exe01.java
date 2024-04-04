package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe01 {
     public static void main(String[] args) {
        //Leia 2 valores inteiros e imprima sua soma.

        Scanner dig = new Scanner (System.in);
        System.out.print("Informe dois números: ");

        int n1 = dig.nextInt();
        int n2 = dig.nextInt();
        int soma = n1 + n2;

     System.out.println("A soma é " + soma);

     dig.close();

     

//EXEMPLO CONCATENAÇÃO            
    //System.out.printf("A soma de %d com %d é: %d%n", n1, n2, soma);


        //VERSÃO BEECROWD

        /*  Scanner teclado = new Scanner (System.in);

        //ENTRADA
        int valorA = teclado.nextInt();
        int valorB = teclado.nextInt();

        //PROCESSO
        int x = valorA + valorB;

        //SAÍDA
        System.out.println("X = " + x);
        teclado.close(); */
    
    }
}
