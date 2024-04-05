package EXERCICIOS.src.UNIDADE04;
import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        //Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as idades dos filhos e exibir quem é a caçula da família; suponha que não haja empates.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade de Marquinhos: ");
        int idadeM = sc.nextInt();

        System.out.print("Informe a idade de Zezinho: ");
        int idadeZ = sc.nextInt();

        System.out.print("Informe a idade de Luluzinha: ");
        int idadeL = sc.nextInt();

        if (idadeM < idadeL && idadeM < idadeZ) {
            System.out.println("Marquinhos é o caçula");

        } else if (idadeZ < idadeL && idadeZ < idadeM) {
            System.out.println("Zezinho é o caçula");
            
        } else{
            System.out.println("Luluzinha é a caçula");
        }

        sc.close();
    }
    
}
