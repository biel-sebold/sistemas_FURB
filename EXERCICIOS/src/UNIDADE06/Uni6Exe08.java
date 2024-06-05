package EXERCICIOS.src.UNIDADE06;

import java.util.Scanner;

//Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real. Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor.

public class Uni6Exe08 {

	private Uni6Exe08() {
		Scanner sc = new Scanner(System.in);

		int tamVet;

		do {
			System.out.print("Tamanho Vetor: ");
			tamVet = sc.nextInt();
		} while ((tamVet < 1) || (tamVet > 20));
		double vet[] = new double[tamVet];

		ler(vet, sc);
		System.out.println("---");

		escrever(vet);
		System.out.println("---");

		acharIgual_A(vet);
		System.out.println("---");

		acharIgual_B(vet);

		sc.close();
	}

	private void ler(double vet[], Scanner sc) {

		for (int i = 0; i < vet.length; i++) {

			System.out.print("vet[" + i + "]: ");
			vet[i] = sc.nextDouble();
		}
	}

	private void escrever(double vet[]) {

		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

	private void acharIgual_A(double vetor[]) {

		boolean achou[] = new boolean[vetor.length];

		for (int i = 0; i < achou.length; i++) {
			achou[i] = false;
		}

		System.out.println("VALOR   |  FREQÜÊNCIA  ");
		int contador;

		for (int i = 0; i < vetor.length; i++) {
			contador = 0;

			for (int j = 0; j < vetor.length; j++) {
				if (!achou[j]) {
					if (vetor[i] == vetor[j]) {
						achou[j] = true;
						contador++;
					}
				}
			}
			if (contador > 0) {
				System.out.println(vetor[i] + " | " + contador);
			}
		}
	}

	private void acharIgual_B(double vet[]) {

		System.out.println("|  VALOR   |  FREQÜÊNCIA | ");

		int qtd;
		int eleLista = 0;
		boolean pesq;

		while (eleLista < vet.length) {
			qtd = 1;
			int pesAbaixo = 0;
			pesq = true;
			while (pesAbaixo < eleLista) {
				if (vet[pesAbaixo] == vet[eleLista]) {
					pesq = false;
				}
				pesAbaixo++;
			}
			if (pesq) {
				System.out.print("|  " + (vet[eleLista]) + "    |         ");
				int indTeste = eleLista + 1;
				while (indTeste < vet.length) {
					if (vet[eleLista] == vet[indTeste]) {
						qtd++;
					}
					indTeste++;
				}
				System.out.println(qtd + "   |");
			}
			eleLista++;
		}
	}

	public static void main(String[] args) {
		new Uni6Exe08();
	}

}
