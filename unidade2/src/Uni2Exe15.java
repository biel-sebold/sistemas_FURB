package EXERCÍCIOS.UNIDADE02;

import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        //AJUDADO BEECROWD//
        //Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0,50, 0,25, 0,10, 0,05 e 0,01. A seguir mostre a relação de notas de permissão.

        Scanner dig = new Scanner(System.in);
        double valor = dig.nextDouble();

        System.out.println(valor);
        
        System.out.println("NOTAS: ");
        
        System.out.println((int)valor/100 + " nota(s) de R$ 100.00");
        valor = valor % 100;

        System.out.println((int)valor/50 + " nota(s) de R$ 50.00");
        valor = valor % 50;

        System.out.println((int)valor/20 + " nota(s) de R$ 20.00");
        valor = valor % 20;

        System.out.println((int)valor/10 + " nota(s) de R$ 10.00");
        valor = valor % 10;

        System.out.println((int)valor/5 + " nota(s) de R$ 5.00");
        valor = valor % 5;

        System.out.println((int)valor/2 + " nota(s) de R$ 2.00");
        valor = valor % 2;
    
        
        System.out.println("MOEDAS: ");
        
        System.out.println((int)valor/1 + " moeda(s) de R$ 1.00");
        valor = valor % 1;

        System.out.println((int)valor/50 + " moeda(s) de R$ 0.50");
        valor = valor % 50;

        System.out.println((int)valor/25 + " moeda(s) de R$ 0.25");
        valor = valor % 25;

        System.out.println((int)valor/10 + " moeda(s) de R$ 0.10");
        valor = valor % 10;

        System.out.println((int)valor/5 + " moeda(s) de R$ 0.05");
        valor = valor % 5;
        
        System.out.println((int)valor/1 + " moeda(s) de R$ 0.01");



    }   
    
}
