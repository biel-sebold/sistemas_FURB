import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        //Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

        // o número de inscrição e a altura do atleta mais alto;
        // o número de inscrição e a altura do atleta mais baixo;
        // a altura média do grupo de atletas.

        // A leitura deve ser finalizada ao digitar 0 para o número de inscrição.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de inscrição: ");
        int num = sc.nextInt();

        int contador = 0;
        double altura = 0;

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        int numMaior = 0;
        int numMenor = 0;

        double soma = 0;
        
        while (num != 0) {
            System.out.print("Informe a altura do atleta: ");
            altura = sc.nextDouble();

            if (altura > maior) {
                maior = altura;
                numMaior = num;
            }

            if (altura < menor) {
                menor = altura;
                numMenor = num;
            }

            soma += altura;
            contador++;

            System.out.print("Informe o número de inscrição: ");
            num = sc.nextInt();
            
        }

        System.out.printf("\nO atleta com n° de inscrição %d é o mais alto, com %.2f cm\n", numMaior, maior);
        System.out.printf("O atleta com n° de inscrição %d é o mais baixo com %.2f cm\n\n", numMenor, menor);

        double media = soma / contador;
        System.out.printf("A altura média do grupo é de %.2fcm", media);

        sc.close();
       
    }

}
