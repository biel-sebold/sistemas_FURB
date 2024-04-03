package EXERCÍCIOS.UNIDADE04;

import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        //DANTON//
        //Dado uma letra, escreva um algoritmo que informa se ela é ou não uma vogal.
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma letra: ");

        char letra = sc.nextLine().charAt(0);
        letra = Character.toLowerCase(letra);


        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal");

        } else{
            System.out.println("Não é vogal");
        }

    }

}