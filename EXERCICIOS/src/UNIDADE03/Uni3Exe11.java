package EXERCICIOS.src.UNIDADE03;
import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        //AJUDADO//
        //Descreva um programa que fornece uma temperatura em °C informando seu valor em °F. Fórmula:
        //°F = (°C * 9/5) + 32

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em °C: ");
        double cel = sc.nextDouble();
        
        double far = (cel * 9/5) + 32;

        System.out.printf("%.1f°C é equivalente a %.1f°F", cel, far);
    }
    
}
