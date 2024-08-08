import java.util.Scanner;

public class Uni5EXe30 {
    public static void main(String[] args) {
        //BELLETTI
        //Implemente o problema da contador. Tendo-se uma sequência decrescente de números inteiros positivos que inicia em N, com decremento inteiro positivo K, deseja-se empacotá-los em uma contador com tamanho M, de forma que se coloque dentro dela preferencialmente os maiores valores, até que ela esteja cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

        // os elementos a serem colocados na contador;
        // os elementos que entraram na contador;
        // os que ficaram fora da contador;
        // qual é a soma dos elementos que entraram na contador;
        // qual a soma dos elementos que não entraram na contador.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor inicial (inteiro positivo): ");
        int n = sc.nextInt();

        System.out.print("Informe um valor de decremento(inteiro positivo): ");
        int k = sc.nextInt();

        String todosItens = "";
        int totalItens = 0;
        
        int cont = 1;
        int somaMochila = 0;
        String naMochila = "";
        int somaFora = 0;
        String foraMochila = "";
        //tamanho M da mochila vai ser 10
        while (cont <= 10) {
            somaMochila += n;

            naMochila += String.format("Item %d: %d\n", cont, n); //STRING.FORMAT SÓ ARMAZENA
            todosItens += String.format("Item: %d\n", n); //STRING.FORMAT SÓ ARMAZENA 
            totalItens++;
            cont++;
            n -= k;
        }

        cont = 1;

        while(n > 0){
            somaFora += n;

            foraMochila += String.format("Item %d: %d\n", cont, n);
            todosItens += String.format("Item: %d\n", n);
            totalItens++;
            cont++;
            n -= k;
        }

        System.out.printf("Itens a serem adicionados: (%d)\n%s",totalItens, todosItens);

        System.out.println("\nItens que entraram na mochila: (10)\n" + naMochila);

        System.out.printf("Itens que ficaram fora da mochila: (%d)\n%s",(totalItens-10), foraMochila);

        System.out.println("\nSoma dos itens que entraram: " + somaMochila);

        System.out.println("Soma dos itens que não entraram: " + somaFora);

        sc.close();


        
    }

}
