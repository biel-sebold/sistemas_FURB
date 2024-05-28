package EXERCICIOS.src.UNIDADE06;

import java.util.Scanner;

// Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. Informe para o usuário se este valor informado se encontra cadastrado no vetor. Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.

public class Uni6Exe06 {

    private Uni6Exe06() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor N (inteiro): ");
        int valorN = sc.nextInt();

        

    }

    private double[] ler(Scanner s, double vetor[]) {

        double valores[] = new double[vetor.length];

        for(int i = 0; i <= vetor.length; i++) {
            System.out.printf("Informe o %dº número real: ", i);
    
        }

        System.out.print("\n\nInforme um outro valor real: ");
        double real = s.nextDouble();


    }

    private boolean[] conferir(boolean opcao) {

        if (opcao) {
            
        }
    }

    
}