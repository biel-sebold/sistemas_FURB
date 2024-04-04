package EXERCICIOS.src.UNIDADE03;
import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        //Construa um programa para ler um número inteiro (assumindo até 3 dígitos) e imprima a saída da seguinte forma:
        /*X centena(s)  Y dezena(s) K unidade(s)  
        Exemplo, se for solicitado o número 384, o programa deverá exibir:
        3 centena(s)  8 dezena(s) 4 unidade(s)*/  

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número qualquer: ");
        int num = sc.nextInt();

        int centena = num / 100;
        int dezena = (num % 100) / 10;
        int unidade = num % 10;

        System.out.printf("%d centena(s) %d dezena(s) %d unidade(s)", centena, dezena, unidade);


    }
    
}
