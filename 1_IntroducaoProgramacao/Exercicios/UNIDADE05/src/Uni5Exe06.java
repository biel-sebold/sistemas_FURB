import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        //MEIO BELLETTI
        //Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

        Scanner sc = new Scanner (System.in);

        double soma = 0;

        for(int i = 1; i <= 20; i++){

        System.out.printf("Informe a altura da pessoa %d: ", i);
        double altura = sc.nextDouble();
        soma += altura;


    }
       double media = soma / 20;
       System.out.printf("Média = %.1fm", media);

       sc.close();
}

}
