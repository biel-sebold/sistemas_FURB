import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        //AJUDADO//
        //Considere que você tem um papel quadrado e o dobro varia sempre em um número par de dobra no meio do quadrado. Ao abrir uma folha de papel é possível verificar a marcação de novos quadrados. Com base nisso, leia o número de dobras (lembre que sempre é um número par) feito no papel e envie quantos quadrados podem ser vistos após desdobrá-lo.

        Scanner dig = new Scanner(System.in);

        System.out.print("Digite o número de dobras (um número par): ");
        int numDobras = dig.nextInt();

        if (numDobras % 2 != 0) {
            System.out.print("O número de dobras deve ser par.");
        }

        double numQuadrados = Math.pow(2, numDobras / 2);

        System.out.println("Após desdobrar o papel, o número de quadrados visíveis é: " + numQuadrados);

        dig.close();

    }
}
