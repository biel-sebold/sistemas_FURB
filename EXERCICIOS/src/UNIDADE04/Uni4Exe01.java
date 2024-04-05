package EXERCICIOS.src.UNIDADE04;
import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        //A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalha mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possui 4 semanas exatas).

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com as horas trabalhadas no mês: ");
        int horasMes = sc.nextInt();

        System.out.print("Entre com o valor pago por hora: R$");
        double horasValor = sc.nextDouble();

        double salarioTotal = horasMes * horasValor;

        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor/2);
            salarioTotal = salarioTotal + salarioExtra;
            //salarioTotal += salarioExtra; (EQUIVALENTES)
        }

        System.out.printf("O salário total é: R$%.2f", salarioTotal);

        sc.close();

  }
}
