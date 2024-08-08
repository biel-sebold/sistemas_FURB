import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) {
        //BELLETTI
        // Descreva um algoritmo que calcula e escreve a soma dos números pares e a soma dos números ímpares entre 1 e 100.
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for(int i = 1; i <= 100; i++){

            if (i % 2 == 0) {
               pares += i;
                
            } else{
                impares += i;
            }
           

        }
        System.out.printf("SOMA DOS NÚMEROS PARES: %d%n", pares);

        System.out.printf("SOMA DOS ÍMPARES: %d%n", impares);

        sc.close();


}
}