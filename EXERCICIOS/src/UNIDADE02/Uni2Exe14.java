package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        //AJUDADO BEECROWD//
        //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas permitida.

        Scanner dig = new Scanner(System.in);

        int valor = dig.nextInt();

        System.out.println(valor);
        
        System.out.println(valor/100 + " nota(s) de R$ 100,00");
        valor = valor % 100;

        System.out.println(valor/50 + " nota(s) de R$ 50,00");
        valor = valor % 50;

        System.out.println(valor/20 + " nota(s) de R$ 20,00");
        valor = valor % 20;

        System.out.println(valor/10 + " nota(s) de R$ 10,00");
        valor = valor % 10;

        System.out.println(valor/5 + " nota(s) de R$ 5,00");
        valor = valor % 5;

        System.out.println(valor/2 + " nota(s) de R$ 2,00");
        valor = valor % 2;
        
        System.out.println(valor/1 + " nota(s) de R$ 1,00");
        valor = valor % 1;

        dig.close();
        
    }
    
}
