package teste.src;
import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        //Descreva um programa que leia o comprimento dos catetos de um retângulo e calcule o comprimento da hipotenusa.
        //hipotenusa^2=cateto1^2+cateto^2

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o comprimento do cateto 1: ");
        double cat1 = sc.nextDouble();

        System.out.println("Informe o comprimento do cateto 2: ");
        double cat2 = sc.nextDouble();

        double hip = Math.sqrt(cat1 * cat1 + cat2 * cat2);

        System.out.printf("O comprimento da hipotenusa é: %.1f", hip);
    }
    
}
