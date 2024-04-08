package EXERCICIOS.src.UNIDADE04;

import java.util.Scanner;

public class UNi4Exe26 {
    public static void main(String[] args) {
        //Dado um caractere indicar uma opção, escreva um algoritmo para:
// se opção = 'T': calcular a área de um triângulo de base b e altura h (b*h/2)
// se opção = 'Q': calcular a área de um quadrado de lado l (l*l)
// se opção = 'R': calcular a área de um retângulo de base b e altura h (b*h)
// se opção = 'C': calcular a área de um círculo de raio r (pi*r^2)

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma das opções: ");
        System.out.println("T: triângulo\nQ: quadrado\nR: retângulo\nC: círculo");

        char opcao = sc.nextLine().charAt(0);


        switch (opcao) {
            case (char) 'T':
                System.out.print("Informe a base: ");
                float baseT = sc.nextFloat();
                System.out.print("Informe a altura: ");
                float alturaT = sc.nextFloat();

                float areaT = baseT * alturaT / 2;
                System.out.printf("Área do triângulo = %.1f", areaT);
            break;
            
            case (char) 'Q':
               System.out.print("Informe a medida do lado: ");
               float lado = sc.nextFloat();
               float areaQ = lado * lado;
               System.out.printf("Área do quadrado = %.1f", areaQ);
            break;

            case (char) 'R':
               System.out.print("Informe a base: ");
               float baseR = sc.nextFloat();
               System.out.print("Informe a base: ");
               float alturaR = sc.nextFloat();

               float areaR = baseR * alturaR;
               System.out.printf("Área do retângulo = %.1f", areaR);
            break;

            case (char) 'C':
               System.out.print("Informe o raio: ");
               float raio = sc.nextFloat();
               double areaC = Math.PI * Math.pow(raio,2);
               System.out.printf("Área do círculo = %.1f", areaC);
        
            default:
            System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }


}
