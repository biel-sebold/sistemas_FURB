package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe04 {
     public static void main(String[] args) {
        //AJUDADO//
        //Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A tem peso 3,5 e a nota B  7,5 (a soma dos pesos é 11), sendo que a nota vai de 0,0 a 10,0.

        Scanner dig = new Scanner(System.in);

        System.out.print("Informe a nota A: ");
        double notaA = dig.nextDouble();

        System.out.print("Informe a nota B: ");
        double notaB = dig.nextDouble();

        double PESO_A = 3.5;
        double PESO_B = 7.5;
        double somaDosPesos = PESO_A + PESO_B;

        double mediaPonderada = (notaA*PESO_A) + (notaB*PESO_B) / somaDosPesos;
        System.out.printf("A média ponderada será igual a: %.1f", mediaPonderada);

    }
   
    
}
