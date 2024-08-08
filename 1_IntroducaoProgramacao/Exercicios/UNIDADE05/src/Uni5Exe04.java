import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args) {
        //BELLETTI
        //Descreva um algoritmo para calcular o valor de S dado por:
        // S= 3/2 + 5/6 + 7/12 + 9/20 + 11/30 + ...
        // Considere os 20 primeiros termos da série.

        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double variavel = 0;
        double denominador = 0;

        for(double i = 1; i <= 20; i++){
            double numerador = 2 * i + 1;
            variavel += 2;
            denominador += variavel;

            double termo = numerador / denominador;
            soma += termo;
            
        }

        System.out.printf("A soma é: %f", soma);

        sc.close();


    }

}
