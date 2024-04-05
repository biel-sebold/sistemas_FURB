package EXERCICIOS.src.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        //Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário do funcionário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Informe a quantos meses o funcionário foi admitido: ");
        int meses = sc.nextInt();

        double reajuste;

        if (meses <= 12) {
            reajuste = 0.05;
            
        } else{
            reajuste = 0.07;
            
        }

        double valor = (salario * reajuste);

        System.out.printf("O valor de reajuste que o funcionário receberá no seu salário será de: R$ %.2f", valor);    

        sc.close();

    }
    
}
