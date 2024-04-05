package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        //AJUDADO//
        //Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensalmente e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário de trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário de trabalho para o INSS e de 5% sobre o salário de trabalho para o imposto de renda. Ao relatório final o nome, o salário bruto e o salário líquido do funcionário.

        Scanner dig = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = dig.nextLine();

        System.out.print("Informe o número de horas trabalhadas mensalmente: ");
        int horas = dig.nextInt();

        System.out.print("Informe seu número de dependentes: ");
        int dependentes = dig.nextInt();

        double salHora = 10.00;

        double salBruto = salHora * horas + (60.00 * dependentes);

        double INSS = salBruto * 0.085;
        double IR = salBruto * 0.05;
        double salLiquido = salBruto - INSS - IR;
        
        System.out.println("\nRELATÓRIO FINAL:");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Bruto: R$%.2f\n", salBruto);
        System.out.printf("Salário Líquido: R$%.2f", salLiquido);

        dig.close();

    }
    
}
