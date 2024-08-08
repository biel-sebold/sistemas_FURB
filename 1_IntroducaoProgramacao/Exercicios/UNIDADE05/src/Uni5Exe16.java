import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        //Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.

        Scanner sc = new Scanner(System.in);

        int contador = 1;

        int contadorF = 0;
        int contadorG = 0;
        
        double somaF = 0;
        double somaG = 0;

        System.out.printf("Informe a altura da %dº pessoa: ", contador);
        double altura = sc.nextDouble();

        while (altura != 0) {

            System.out.print("Informe o gênero (M ou F ou O): ");
            String entrada = sc.next();
            char genero = entrada.toLowerCase().charAt(0);
            
            //AJUDADO NA ORDEM
            if (genero == 'f') {
                contadorF++;
                somaF+=altura;
                
            }

            contadorG++;
            somaG+=altura;

            //AJUDADO NA ORDEM
            System.out.print("Informe a altura da próxima pessoa: ");
            altura = sc.nextDouble(); 

        }

        double mediaF = somaF / contadorF;
        double mediaG = somaG / contadorG;

        //AJUDADO
        if (contadorF > 0) {
            System.out.printf("Média de altura das mulheres é: %.2fcm", mediaF);
        } else {
            System.out.println("Nenhuma mulher foi registrada");
        }
        
        System.out.printf("\nMédia de altura do grupo é: %.2fcm", mediaG);

        sc.close();
    }

}
