package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        //Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do  vendedor: ");
        String nome = sc.next();

        String dados = "";

        while (dados != "n" ) {

            System.out.print("Informe o número de produtos vendidos: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++)
            
            System.out.print("Informe o preço unitário do produto: R$");
            double preco = sc.nextDouble();

            System.out.printf("Informe quantas unidades foram vendidas: ");
            int quantidade = sc.nextInt();

            double totalVendas = preco * quantidade;

            System.out.printf("O total de vendas do vendedor %s foi R$%.2f", nome, totalVendas);
    
        }
       

        // sc.close();
    }

}
