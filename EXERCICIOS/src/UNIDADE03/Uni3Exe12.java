package EXERCICIOS.src.UNIDADE03;
import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        //Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensalmente e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário de trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário de trabalho para o INSS e de 5% sobre o salário de trabalho para o imposto de renda. Descreva um programa que informa o nome, o salário bruto e o salário líquido do funcionário.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Informe o número de horas trabalhadas mensalmente: ");
        int horas = sc.nextInt();

        System.out.print("Informe seu número de dependentes: ");
        int dependentes = sc.nextInt();

        double salHora = 10.00;

        double salBruto = salHora * horas + (60.00 * dependentes);

        double INSS = salBruto * 0.085;
        double IR = salBruto * 0.05;
        double salLiquido = salBruto - INSS - IR;
        
        System.out.println("\nRELATÓRIO FINAL:");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Salário Bruto: R$%.2f\n", salBruto);
        System.out.printf("Salário Líquido: R$%.2f", salLiquido);

        sc.close();
        

    }
    
}
