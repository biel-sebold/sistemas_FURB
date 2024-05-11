package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        //Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da compra: R$");
        double compra = sc.nextDouble();

        double desconto = 0;
        double total = 0;

        while (compra != 0) {

            if (compra > 500) {
                desconto = 0.2;
                total = compra - (compra * 0.2);
                
            } else {
                desconto = 0.15;
                total = compra - (compra * 0.15);
            }

            
            
        }


        sc.close();

    }

}
