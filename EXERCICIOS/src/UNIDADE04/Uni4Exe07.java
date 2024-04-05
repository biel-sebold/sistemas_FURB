package EXERCICIOS.src.UNIDADE04;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
    //AJUDADO//
    //O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou frações, em que exceder aquele peso. Escreva um algoritmo que dê o peso da carta, em gramas, determine o custo do selo.

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o peso de uma carta (em gramas): ");
    int peso = sc.nextInt();
    double preco = 0.45;
    double custo;


    if (peso <= 50) {
        custo = 0.45;
        
    } else {
        // Calcular o peso excedente além de 50 gramas
        int pesoExcedente = peso - 50;
        // Calcular o número de incrementos de 20 gramas
        int incrementosDe20g = (int) Math.ceil((double) pesoExcedente / 20);
        double custoAdd20g = 0.45;
        custo = preco + (incrementosDe20g * custoAdd20g);
    }

    System.out.printf("O custo do selo será R$%.2f", custo); 

    sc.close();
  }
}