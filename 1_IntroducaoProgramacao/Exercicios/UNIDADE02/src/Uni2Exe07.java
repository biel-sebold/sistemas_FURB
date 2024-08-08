import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
     //Faça um programa que leia o nome de um vendedor, seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informe o total a receber no final do mês, com duas casas decimais.

     Scanner dig = new Scanner (System.in);

     System.out.print("Informe o nome do vendedor: ");
     String nomeFunc = dig.nextLine();

     System.out.print("Informe seu salário fixo: ");
     double salFixo = dig.nextDouble();

     System.out.print("Informe o total de vendas efetuadas por ele no mês (em dinheiro): ");
     double totalVendas = dig.nextDouble();

     double salFinal = salFixo + (totalVendas*0.15);

     System.out.printf("O total a receber do funcionário %s no final do mês será: R$%.2f", nomeFunc,salFinal);

     dig.close();
     
     
   }


    
}

