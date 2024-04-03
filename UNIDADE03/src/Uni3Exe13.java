package EXERCÍCIOS.UNIDADE03;

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        //Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escreva o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

        Scanner sc = new Scanner(System.in);

        double preçoAzulejo = 12.50;
        double m2 = 9 * preçoAzulejo;

        System.out.print("Considerando uma parede, informe seu comprimento em metros: ");
        int comprimento = sc.nextInt();

        System.out.print("Agora informe a sua altura: ");
        int altura = sc.nextInt();

        double areaParede = comprimento * altura;
        double quantidadeAzulejos = Math.ceil(areaParede*m2);
        double valor = quantidadeAzulejos * preçoAzulejo;

        System.out.printf("O valor gasto foi: R$%.2f", valor);
        
    }
    
}
