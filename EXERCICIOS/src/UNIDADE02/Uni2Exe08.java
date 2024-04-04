package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe08 {
     public static void main(String[] args) {
    //Neste problema, você deve ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

    Scanner dig = new Scanner (System.in);

    System.out.print("Informe o código da peça 1: ");
    int codP1 = dig.nextInt();

    System.out.print("Informe o número de peças 1: ");
    int numTotalP1 = dig.nextInt();

    System.out.print("Informe o valor unitário da peça 1: ");
    double valorUniP1 = dig.nextDouble();

    
    System.out.print("Informe o código da peça 2: ");
    int codP2 = dig.nextInt();

    System.out.print("Informe o número de peças 2: ");
    int numTotalP2 = dig.nextInt();

    System.out.print("Informe o valor unitário da peça 2: ");
    double valorUniP2 = dig.nextDouble();

    double valorTotal = (numTotalP1*valorUniP1) + (numTotalP2*valorUniP2);
    System.out.printf("O valor total a ser pago nas peças %d e %d será: R$%.2f", codP1, codP2, valorTotal);

    dig.close();
 }
    
}


