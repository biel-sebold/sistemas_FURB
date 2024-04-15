package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        //AJUDADO//
        //Num sistema de equações o valor de A equivale ao valor de B e o valor de C equivale ao valor de D. Leia os valores de B, C e D e calcule o valor de A.

        Scanner dig = new Scanner(System.in);


        System.out.print("Informe um valor para B: ");
        double B = dig.nextDouble();

        System.out.println("Informe um valor para C: ");
        double C = dig.nextDouble();

        System.out.println("Informe um valor para D: ");
        double D = dig.nextDouble();

        double A = B;
        

        System.out.println("O valor de A é igual a: " + A);
        System.out.println("O valor de C é igual a: " + resultadoC + "e não" + C);

        dig.close();

    }
}
