import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        //AJUDADO//
        //Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorrer até o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento é no dia. Se o pagamento for realizado até cinco dias após o vencimento ou o cliente perder o desconto, e se o pagamento atrasado mais de cinco dias, for cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as mensagens devidas. Suponha que todo vencimento ocorra até o dia dez de cada mês e os clientes nunca deixem para pagar no mês seguinte.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o dia do vencimento: ");
        int dia = sc.nextInt();

        System.out.print("Informe qual foi o dia do pagamento: ");
        int pagamento = sc.nextInt();

        System.out.print("Informe o valor da prestação: R$ ");
        double prestacao = sc.nextDouble();

        double valorTotal;
        int atraso = pagamento - dia;

        if (pagamento <= dia) {
            double desconto = prestacao * 0.10;
            valorTotal = prestacao - desconto;
            System.out.println("O pagamento é no dia");
            System.out.printf("Desconto de R$ %.2f\n ", desconto);
            
        } else if (pagamento <= dia + 5) {
            valorTotal = prestacao;
            System.out.println("Pagamento realizado até 5 dias após o vencimento");

        } else{
            double multa = prestacao * 0.02 * atraso;
            valorTotal = prestacao + multa; 
            System.out.println("Pagamento realizado 5 dias após o vencimento");
            System.out.printf("Multa de %.2f", multa);

        }

        System.out.printf("O valor a ser pago pelo cliente será: R$ %.2f", valorTotal);

        sc.close();
    }

}
