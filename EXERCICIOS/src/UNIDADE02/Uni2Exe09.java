package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
    //Uma pessoa foi até uma casa de câmbio de dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para uma pessoa.

    Scanner dig = new Scanner(System.in);

    System.out.print("Insira o valor em dólares entregue: ");
    double valorDolares = dig.nextDouble();
    double cotacao = 4.9528;

    double valorReais = valorDolares * cotacao;
    System.out.printf("O atendente deve devolver à pessoa R$%.2f", valorReais);

    }
    
}
