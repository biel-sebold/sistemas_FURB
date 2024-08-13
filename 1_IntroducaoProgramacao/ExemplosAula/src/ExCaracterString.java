import java.util.Scanner;

public class ExCaracterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nome = sc.next();
        char letra = nome.toLowerCase().charAt(0);
        System.out.println(letra);

        sc.close();
    }
    
}
