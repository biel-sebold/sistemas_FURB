import java.util.Scanner;

//Descreva um algoritmo que ler 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos. FAÇA UM MÉTODO PARA LER E OUTRO PARA ESCREVER.

public class Uni6Exe01Met {
    private Uni6Exe01Met() {
        Scanner sc = new Scanner(System.in);

        int valores[] = new int [10];

        ler(sc, valores);
        escrever(valores);
        sc.close();

    }

    private void ler(Scanner scan, int vetor[]) {
        for( int i = 0; i < vetor.length; i++) {

            System.out.printf("Informe o número %d: ", i + 1);
            vetor[i] = scan.nextInt();
        }
    }


    private void escrever(int vetor[]) {
        System.out.println("\n***** MOSTRANDO VALORES *****");

        for(int i = vetor.length - 1; i >= 0; i--) {
            System.out.printf("Posição %d --> valor %d\n", i + 1, vetor[i]);
        }
    }
    public static void main(String[] args) {
        new Uni6Exe01Met();
    }

}
