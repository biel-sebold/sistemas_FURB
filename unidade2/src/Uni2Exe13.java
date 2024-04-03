package EXERCÍCIOS.UNIDADE02;

import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        //AJUDADO BEECROWD//
        //Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar uma milha a cada 2 minutos. Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro e tome essa distância do outro carro.

        Scanner dig = new Scanner(System.in);

        System.out.print("Informe a distância: ");

        int distancia = dig.nextInt();
        int tempo = distancia*2;
        System.out.printf("O carro tomará essa distância do outro em %d minutos", tempo);
        
    }
    
}
