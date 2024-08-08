import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        //BELLETTI
        //Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triângulo de Floyd:

        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15
        // 16 17 18 19 20 21

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de linhas: ");
        int n = sc.nextInt();

        System.out.printf("\nTriângulo de Floyd com %d linhas: ", n);

        int ultLinha = 1; //é 1 para que o triângulo siga o padrão do exemplo
        int linhaAnt = 0; //é 0 para que o triângulo siga o padrão do exemplo

        for (int i = 1; i <= n; i++) {
                
            for (int j = ultLinha; j <= linhaAnt + ultLinha; j++) {
                System.out.print(j +" "); //escreve os números
            }
                
            linhaAnt++; //faz com que a soma termo após termo seja feita

            ultLinha += linhaAnt; //faz com que termo se aumente um 
            //(IMPEDE QUE NA TROCA DE LINHA A SEQUÊNCIA REINICIE)
                
            System.out.println(" "); //dá forma ao triângulo
            }

        sc.close();    

    }

}
