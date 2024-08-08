import java.util.Scanner;

// Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.

// Baseado nisto faça um programa que informe:
    // qual a nota média recebida pelo cinema;
    // qual a nota média atribuída pelos homens;
    // qual a nota atribuída pela mulher mais jovem;
    // quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.

// Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício.

public class Uni6Exe09 {

    private Uni6Exe09() {

      int clientes = 30; // 30 clientes [30][ ]
      int respostas = 3; // 3 respostas [ ][3] -> sexo, nota e idade
      int dados[][] = new int[clientes][respostas];
  
      ler(dados, clientes, respostas);
      informar(dados, clientes, respostas);
    }
  
    private void ler(int dados[][], int clientes, int respostas) {
      Scanner sc = new Scanner(System.in);
  
      for (int i = 0; i < clientes; i++) {

        System.out.printf(" _ Informe os dados para o cliente [", i + 1);

        System.out.print("sexo (1=feminino 2=masculino): ");
        dados[i][0] = sc.nextInt();

        System.out.print("\nnota para o cinema (zero até dez): ");
        dados[i][1] = sc.nextInt();

        System.out.println("\nidade: ");
        dados[i][2] = sc.nextInt();
      }
  
      sc.close();
    }
  
    private void informar(int dados[][], int clientesQtd, int respostas) {

      int clientesSoma = 0;
      int homemNota = 0;
      int homemQtd = 0;
      int mulherJovemId = -1;
      int mulherJovemIdade = 999;
  
      for (int cliente = 0; cliente < clientesQtd; cliente++) {

        clientesSoma += dados[cliente][1];

        if (dados[cliente][0] == 2) { // homem
          homemNota += dados[cliente][1];
          homemQtd++;

        }
        if (dados[cliente][0] == 1) { // mulher

          if (dados[cliente][2] < mulherJovemIdade) {
            mulherJovemIdade = dados[cliente][2];
            mulherJovemId = cliente;

          }
        }
      }

      double notaMedia = (double) clientesSoma / clientesQtd;
      System.out.println("Nota média recebida pelo cinema: " + notaMedia);

      double notaMediaHomem = (double) homemNota / homemQtd;
      System.out.println("Nota média atribuída pelos homens: " + notaMediaHomem);

      System.out.println("Nota atribuída pela mulher mais jovem: " + dados[mulherJovemId][1]);
  
      int mulherMedia = 0;

      for (int cliente = 0; cliente < clientesQtd; cliente++) {

        if (dados[cliente][2] > 50) { // mulher, idade > 50

          if (dados[cliente][1] > notaMedia) {
            mulherMedia++;
          }
        }
      }

      System.out.println("Quantidade de mulheres com mais de 50 anos deram nota superior a média: " + mulherMedia);
  
    }
  
    public static void main(String[] args) {
      new Uni6Exe09();
    }
  
  }
