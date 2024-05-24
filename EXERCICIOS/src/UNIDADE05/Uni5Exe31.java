package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        //BELLETTI
        //Dado um número inteiro positivo, determine a sua decomposição em fatores primos. A saída do programa deve ser semelhante ao exemplo abaixo:

        // número	decomposição
        // 180	        2
        // 90	        2
        // 45	        3
        // 15       	3
        // 5	        5
        // 1	

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int numero = sc.nextInt();
        double numPrimo = 2;

        System.out.println("Número  | Decomposição");

        while(numero != 1){
            boolean div = false;

            while(!div){
                boolean primo = true;
                
                if((double)numero%numPrimo != 0){
                    numPrimo++;
                    primo = false;
                }else{
                    div = true;
                }
                while(!primo){
                   primo = true;
                   for (int i = 2; i < numPrimo; i++) {
                        if(numPrimo%i == 0){
                            primo = false;
                            numPrimo++;
                        }
                    }
                }
            }
         
            System.out.printf("%d\t| %.0f%n", numero, numPrimo);
            numero /= numPrimo;
        }

        System.out.println(1);

        sc.close();
    }
}
