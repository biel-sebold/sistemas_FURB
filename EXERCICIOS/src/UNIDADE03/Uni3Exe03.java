package EXERCICIOS.src.UNIDADE03;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        //Um desejo abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.

        Scanner sc = new Scanner(System.in);

        double preçoGas = 5.75;

        System.out.print("Informe o valor do pagamento: R$");
        double pagamento = sc.nextDouble();

        double litros = pagamento / preçoGas;

        System.out.printf("Ele conseguiu colocar %.1f litros no tanque", litros);


    }
    
}
