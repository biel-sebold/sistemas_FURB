package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        //Leia 2 valores inteiros e imprima sua multiplicação.

        Scanner dig = new Scanner (System.in);
        System.out.println("Informe dois números: ");

        int n1 = dig.nextInt();
        int n2 = dig.nextInt();
        int mul = n1 * n2;

        System.out.println("O valor da multiplicação será: " + mul);

        dig.close();


    //EXEMPLO CONCATENAÇÃO
        //System.out.printf("A multiplicação de %d por %d terá como resultado %d", n1, n2, mul);


    }
    
}
