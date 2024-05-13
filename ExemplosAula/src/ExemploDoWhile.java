package src;

import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int contador = 10;

        // do {
        //     System.out.println(contador++);

        // } while(contador<=5);
        //     System.out.println("FIM");

        // }

//==================================================================================================================

        //LEIA UM NÚMERO QUALQUER E FAÇA SUA TABUADA (for/while/do while)

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        System.out.println("******USANDO FOR******\n");

        System.out.printf("TABUADA DO %d\n", numero);

        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
        }

        int contador = 0;

        System.out.println("\n*******USANDO WHILE******\n");

        System.out.printf("TABUADA DO %d\n", numero);

        while (contador <= 10) {
            System.out.printf("%d x %d = %d\n", numero, contador, (contador++ * numero));
            
        }

        System.out.println("\n******USANDO DO WHILE*****\n");

        System.out.printf("TABUADA DO %d\n", numero);

        contador = 0;

        do {
            System.out.printf("%d x %d = %d\n", numero, contador, (contador++ * numero));

        } while(contador <= 10);


        sc.close();

    }
}
    