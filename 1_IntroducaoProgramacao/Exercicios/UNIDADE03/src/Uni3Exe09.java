import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        //Descreva um programa que calcula o volume de uma lata de óleo. Fórmula:
        //volume = Pi * raio^2 * altura
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe qual o diâmetro da lata de óleo em cm: ");
        double diametro = sc.nextDouble();

        System.out.print("Informe a altura da lata de óleo em cm: ");
        double altura = sc.nextDouble();

        double pi = Math.PI;
        double raio = Math.pow(diametro / 2, 2);
        double volume = (pi * raio * altura) / 1000;
        
        System.out.printf("O volume da lata de óleo é: %.1fL", volume);

        sc.close();



    
    }
    
}
