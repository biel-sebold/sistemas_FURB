package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        //Dado um número inteiro positivo, determine a sua decomposição em fatores primos. A saída do programa deve ser semelhante ao exemplo abaixo:

        // número	decomposição
        // 180	        2
        // 90	        2
        // 45	        3
        // 15       	3
        // 5	        5
        // 1	

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();

        int resultado = 0;
        int decremento = 0;
        while (valor >= 0) {

            if (valor % 2 == 0) {
                 decremento = 2;
                
            } else if (valor % 3 == 0) {
                 decremento = 3;
                
            } else if (valor % 5 == 0) {
                 decremento = 5;
                
            } else if (valor % 7 == 0) {
                decremento = 7;
            } else {
                decremento = 11;
            }

            resultado = valor / decremento;
            valor = resultado;

            System.out.println(resultado);
            
        }
    }

}
