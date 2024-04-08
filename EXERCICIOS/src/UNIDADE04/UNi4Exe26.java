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
        System.out.println("T: Área de um triângulo de base b e altura h\nQ: Área de um quadrado de lado l\nR: Área de um retângulo de base b e altura h\nC: Área de um círculo de raio r");

        char opcao = sc.nextLine().charAt(0);

        switch (opcao) {
            case (char) 'T':
                System.out.println("Informe a base: ");
                float base = sc.nextFloat();
                System.out.println("Informe a altura: ");
                float altura = sc.nextFloat();

                float area = base * altura / 2;
            break;
            
            case (char) 'Q':
            sout    
        
            default:
                break;
        }
    }


}
