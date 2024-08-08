import java.util.Scanner;
//DANTON
// Faça um programa que leia um numero N inteiro limitado a 20 posições. Com base neste numero, crie um vetor do tipo inteiro. Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. Esse número deverá ser armazenado no vetor caso ainda não exista, e se o numero já existir deve ser pedido um novo numero. Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

// Vetor origem: [0][4][2][6][3]
// Vetor ordenado: [0][2][3][4][6]

// Crie um método para inserir os valores no vetor, outro para ordenar o vetor e outro para informar o vetor resultante. Para "método ordenar" se pode usar o "método bolha"

public class Uni6Exe07 {

    private Uni6Exe07() {
        Scanner sc = new Scanner(System.in);

        int valores[] = new int[lerNum(sc, 1, 20)];
        lerVet(sc, valores);
        mostraVetor(valores);
        ordenaVetor(valores);
        mostraVetor(valores);
    }


    private int lerNum(Scanner scan, int minimo, int maximo) {

        int numero = 0;
        do {
            System.out.printf("Informe um numero menor que %d: ", maximo);
            numero = scan.nextInt();

        } while (numero < minimo || numero > maximo);

        return numero;

    }


    private void lerVet(Scanner scan, int vetor[]) {
        
        int i = 0;
        
        while (i < vetor.length) {
            System.out.printf("\n*** POSIÇÃO %d ***\n", i + 1);
            int valor = lerNum(scan, -100000, 100000);

            if (!procura(valor, vetor)) {
                vetor[i] = valor;
                i++;
            } else{
                System.out.printf("Valor %d já existe na posição %d\n", valor, i);
            }

        }

    }


    private boolean procura(int valor, int vetor[]) {

        for (int i = 0; i < vetor.length; i++) {

            if (valor == vetor[i]) {
                return true;
                
            }   
        }
        return false;
    }


    private void mostraVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
           
            System.out.printf("%d  ", vetor[i]);
        }
        System.out.println("");
    }

    
    private void ordenaVetor(int vetor[]) {

        int aux;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {

                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }

}
