import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
        //Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcula quantos biscoitos estão quebrados no final de cada dia (a máquina opera 16 horas por dia).

        Scanner sc = new Scanner(System.in);

        int quebra = 1;
        int quebraTotal = 0;

        for(int i = 1; i <= 16; i++) {

            quebraTotal = quebra *= 3;
        }

        System.out.printf("São quebrados ao final de cada dia: %d biscoitos", quebraTotal);

        sc.close();
    }

}
