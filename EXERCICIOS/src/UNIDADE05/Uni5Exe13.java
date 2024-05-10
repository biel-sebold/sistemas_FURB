package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        // Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, foi registrado o valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. Calcule e escreva:
        // a quilometragem obtida por litro de combustível em cada parada;
        // a quilometragem média obtida por litro de combustível em toda a viagem.

        Scanner sc = new Scanner(System.in);

        double soma = 0;

        System.out.print("Informe as medidas iniciais do hodômetro: ");
        int hodometro = sc.nextInt();
        System.out.print("Informe o número de paradas: ");
        int paradas = sc.nextInt();

        for (int i = 1; i <= paradas; i++) {

            System.out.printf("\nInforme o valor do hodômetro após a %dº parada: ", i);
            int km = sc.nextInt();
            System.out.print("Informe a quantidade de combustível comprada para encher o tanque: ");
            double litro = sc.nextDouble();

            int distancia = km - hodometro;
            double kmLitro = distancia / litro;
            System.out.printf("%dº parada: %.1fKm/L\n", i, kmLitro);

            soma+=kmLitro;
            hodometro+=distancia;

        }

        double kmLitroTotal = soma / paradas; 
        System.out.printf("\nTOTAL DA VIAGEM: %.1fKm/L", kmLitroTotal);

        sc.close();

        
    }

}
