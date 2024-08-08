import java.util.Scanner;

public class Uni2Exe03 {
     public static void main(String[] args) {
    //Calcule a área da faixa elevando o valor do raio ao quadrado e multiplicando por π (π = 3,14159).

    Scanner dig = new Scanner(System.in);

    System.out.print("Informe o valor do raio: ");

    double raio = dig.nextDouble();
    double quadrado = Math.pow(raio, 2);
    double pi = Math.PI;
    double area = quadrado * pi;


    System.out.printf("A área da faixa é igual a: %.4f", area);

    dig.close();



    }
    
}
