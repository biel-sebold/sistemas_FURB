import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        //Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de cédulas que ele precisará combinar para entregar o valor solicitado. Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o 1º valor: ");
        int valor = sc.nextInt();

        int cont = 1;

        while (valor != 0) {
           
            System.out.printf("\n***** DECOMPOSIÇÃO %dº VALOR *****\n", cont);

            System.out.printf("%d nota(s) de R$ 20,00\n", valor/20);
            valor = valor % 20;
            System.out.printf("%d nota(s) de R$ 10,00\n", valor/10);
            valor = valor % 10;
            System.out.printf("%d nota(s) de R$ 5,00\n", valor/5);
            valor = valor % 5;
            System.out.printf("%d nota(s) de R$ 2,00\n", valor/2);
            valor = valor % 2;
            System.out.printf("%d nota(s) de R$ 1,00\n\n", valor/1);
            valor = valor % 1;

            cont += 1;
            System.out.printf("\nInforme o %dº valor: ", cont);
            valor = sc.nextInt();
            
        }

        sc.close();
    }

}
