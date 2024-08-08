import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        //Descreva um programa que a partir da distância percorrida e do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a distância percorrida durante a viagem em km: ");
        double distancia = sc.nextDouble();

        System.out.print("Informe o tempo gasto durante a viagem (em horas): ");
        double tempo = sc.nextDouble();

        double velocidade = distancia / tempo;
        double combustivel = distancia / 12;

        System.out.printf("VELOCIDADE MÉDIA: %.1fkm/h\nCOMBUSTÍVEL GASTO: %.1fL", velocidade, combustivel);

        sc.close();




    }
    
}
