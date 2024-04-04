package EXERCICIOS.src.UNIDADE03;
import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        //Uma pessoa foi até uma casa de câmbio de dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para uma pessoa.

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor em dólares entregue: ");
        double valorDolares = sc.nextDouble();
        double cotacao = 4.9528;

        double valorReais = valorDolares * cotacao;
        System.out.printf("O atendente deve devolver à pessoa R$%.2f", valorReais);
    }
    
}
