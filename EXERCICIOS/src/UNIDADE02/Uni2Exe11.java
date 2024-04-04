package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        /*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3,14159).
        c) uma área do trapézio que tem A e B por bases e C por altura.
        d) uma área do quadrado que tem lado B.
        e) uma área do retângulo que tem lados A e B. */

        Scanner dig = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numA = dig.nextDouble();

        System.out.print("Informe um segundo número: ");
        double numB = dig.nextDouble();

        System.out.print("Informe um terceiro número: ");
        double numC = dig.nextDouble();


        double areaTriRet_baseA_alturaC = numA * numC / 2;
        System.out.println("A área do triângulo retângulo de base A e altura C é: " + areaTriRet_baseA_alturaC);

        double pi = Math.PI;
        double quadrado = Math.pow(numC, 2);
        double areaCirculo_rC = pi * quadrado;
        System.out.println("A área do círculo de raio C é: " +  areaCirculo_rC);

        double areaTrap_baseAB_alturaC = (numA+numB) * numC / 2;
        System.out.println("A área do trapézio de base AB e altura C é: " + areaTrap_baseAB_alturaC);

        double areaQuad_ladoB = numB*numB;
        System.out.println("A área do quadrado de lado B é: " + areaQuad_ladoB);

        double areaRet_ladoAB = numA*numB;
        System.out.println("A área do retângulo de lado AB é: " + areaRet_ladoAB);

    }
    
}
