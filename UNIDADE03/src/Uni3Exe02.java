package EXERCÍCIOS.UNIDADE03;

import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        //Uma loja de calçados está concedendo 12% de desconto em produtos. Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:
        /*O valor do desconto é de R$ xxx
          O preço do par de sapatos com desconto é R$ xxx*/

          Scanner sc = new Scanner(System.in);

          System.out.print("Informe o preço do par de sapatos: R$");
          double preço = sc.nextDouble();

          double desconto = preço * 0.12;
          double valorDesconto = preço - desconto;

          System.out.printf("O valor do desconto é de R$ %.2f\nO preço do par de sapatos com desconto é R$ %.2f", desconto, valorDesconto);



    }
    
}
