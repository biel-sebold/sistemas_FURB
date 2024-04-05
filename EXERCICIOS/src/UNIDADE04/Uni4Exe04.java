package EXERCICIOS.src.UNIDADE04;
import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        //Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double num = sc.nextDouble();

        
        if (num < 0) {
            System.out.println("NÚMERO INVÁLIDO: \n\s- Precisa ser > 0");
            
        } else if (num - (int) num > 0) {
            System.out.println("Número tem casas decimais");
            
        } else{
            System.out.println("Número não tem casas decimais");
        }


        // if (num - Math.floor(num) != 0.0) {
        //     System.out.println("Número tem casas decimais");
            
        // } else{
        //     System.out.println("Número não tem casas decimais");
            
        // } 

        sc.close();
    }
    
}
