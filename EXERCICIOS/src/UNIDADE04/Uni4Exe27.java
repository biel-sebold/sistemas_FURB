package EXERCICIOS.src.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        //AJUDADO//
        //As tarifas de um estacionamento são as seguintes:
        // 1° e 2° hora - R$ 5,00 cada
        // 3° e 4° hora - R$ 7,50 cada
       // 5° hora e seguintes - R$ 10,00 cada

       // O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. Entretanto, se uma pessoa passa menos de 30 minutos, também pagará por uma hora. Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de partida e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo dia.

       Scanner sc = new Scanner(System.in);

       System.out.print("Informe o horário de chegada (hh mm): ");
       int chegadaH = sc.nextInt();
       int chegadaM = sc.nextInt();

       System.out.print("Informe o horário de partida (hh mm): ");
       int partidaH = sc.nextInt();
       int partidaM = sc.nextInt();

       int tempoChegada = chegadaH * 60 + chegadaM;
       int tempoPartida = partidaH * 60 + partidaM;
       int tempoTotal = tempoPartida - tempoChegada; //em minutos
       int qtdHoras = tempoTotal / 60;
       int qtdMinutos = tempoTotal % 60;
       System.out.printf("O tempo que ficou estacionado foi de %0d:%0d\n", qtdHoras, qtdMinutos);

       double preco;

       switch (tempoTotal / 60) {
        case 0:
        case 1:
        case 2:
           preco = 5.0;
        //até 2 horas      
        break;

        case 3:
        case 4:
           preco = 7.50;
        //até 4 horas   
        break;

        default:
        preco = 10.0;
        //mais de 5 horas
        break;
       }

       System.out.printf("O preço a ser cobrado será de: R$%.2f", preco);

       sc.close();


    }

}
