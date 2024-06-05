package EXERCICIOS.src.UNIDADE06;

import java.util.Scanner;

// Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. Informe para o usuário se este valor informado se encontra cadastrado no vetor. Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.

public class Uni6Exe06 {

    private Uni6Exe06() {
      Scanner sc = new Scanner(System.in);

      System.out.print("Informe o tamanho do vetor (N): ");
      int tamanho = sc.nextInt();

      double vetor[] = new double[tamanho];
  
      ler(sc, vetor);
  
      if (pesquisar(sc, vetor)) {
          System.out.println("Encontrou..");
      }
  
      sc.close();
    }
  

    private void ler(Scanner scan, double vetor[]) {

      for (int i = 0; i < vetor.length; i++) {

        System.out.printf("Valor %d: ", i+1);
        vetor[i] = scan.nextInt();
      }
    }
  

    private boolean pesquisar(Scanner scan, double vetor[]) {

      System.out.println("\nInforme valor a ser pesquisado: ");
      double valorPesquisado = scan.nextInt();

      for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] == valorPesquisado) {
          return true;
        }
      }
      return false;
    }
  
    public static void main(String[] args) {
      new Uni6Exe06();
    }
  }