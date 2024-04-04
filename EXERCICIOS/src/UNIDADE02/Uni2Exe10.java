package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
    //AJUDADO//
    //Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

    Scanner dig = new Scanner(System.in);

    System.out.print("Informe o tempo de duração do evento em segundos: ");
    int tSegundos = dig.nextInt();

    int horas = tSegundos / 3600;
    int minutos = (tSegundos % 3600) / 60;
    int segundos = tSegundos % 60;

    /*- As horas são obtidas dividindo o tempo em segundos por 3600 (o número de segundos em uma hora).
      - Os minutos são obtidos pelo resto da divisão do tempo em segundos por 3600, dividido por 60 (o número de segundos em um minuto).
      - Os segundos são obtidos pelo resto da divisão do tempo em segundos por 60. */

    System.out.printf("O tempo de duração do evento: %02d:%02d:%02d", horas, minutos, segundos);

        
    }
    
}
