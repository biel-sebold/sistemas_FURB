package POO.Exercicios.src.LISTA01.questao4;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) {

        //Copie a classe Pessoa do pacote da questão anterior para um novo pacote. Adapte e desenhe o diagrama de classes para criar um programa que solicite ao usuário o nome, altura e peso de três pessoas. Depois que o usuário informar os dados das três pessoas, exiba os dados informados pelo usuário (nome, peso, altura) e seu respectivo IMC em ordem inversa de digitação, isto é, exibir primeiro os dados da terceira pessoas e por último da primeira pessoas.

        Scanner sc = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < 3; i++) {

            System.out.printf("Informe o nome %d: ", i+1);
            String nome = sc.next();

            System.out.printf("Informe a altura de %d: ", i+1);
            double altura = sc.nextDouble();
            
            System.out.printf("Informe o peso de %d: ", i+1);
            double peso = sc.nextDouble();

            Pessoa pessoa = new Pessoa();

            pessoa.nome = nome;
            pessoa.altura = altura;
            pessoa.peso = peso;
            pessoas[i] = pessoa;

            
        }
        
        for (int i = pessoas.length - 1; i >= 0; i--) {

            System.out.printf("Nome: %s", pessoas[i].nome);
            
            System.out.printf("\n>>>IMC PESSOA %d = %.1f<<<\n\n", i+1, pessoas[i].calcularImc());
        }

        sc.close();

        

        
    }
}
