import java.util.Scanner;

// Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

// “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
// “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
// “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
// “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
// “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
// “6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
// “7 – Inverter valores”: desafio (ver abaixo);
// “8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.

// Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.

// Para a opção "6 - Ordenar valores" se pode usar o "método bolha" explicado neste vídeo. Existem também outros vídeos que mostram a lógica de ordenação usando o "método bolha".


// DESAFIO: adapte o código acima para ter mais uma opção no menu para também poder inverter os elementos dentro de um vetor. Assim o último elemento passa a ser o primeiro, o penúltimo passa ser o segundo, e assim sucessivamente para todos os elementos da lista. Mas lembre, não se deve considerar o vetor inteiro, mas somente os elementos que já foram adicionados no vetor.

public class Uni6Exe10 {

	private Uni6Exe10() {
		Scanner sc = new Scanner(System.in);

		int vet[] = new int[50];
		int posFim = 0; // posição no topo do vetor

		System.out.println("\033[H\033[2J"); // limpa console

		int opcao;

		do {
			System.out.println(" ________ MENU ________");
			System.out.println("  1 - Incluir valor");
			System.out.println("  2 - Pesquisar valor");
			System.out.println("  3 - Alterar valor");
			System.out.println("  4 - Excluir valor");
			System.out.println("  5 - Mostrar valores");
			System.out.println("  6 - Ordenar valores");
			System.out.println("  7 - Inverter valores");
			System.out.println("  8 - Sair do sistema");
			System.out.print(" Opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				posFim = incluir(vet, posFim, sc);
				break;
			case 2:
				pesquisar(vet, posFim, sc);
				break;
			case 3:
				alterar(vet, posFim, sc);
				break;
			case 4:
				posFim = excluir(vet, posFim, sc);
				break;
			case 5:
				mostrar(vet, posFim);
				break;
			case 6:
				ordenar(vet, posFim);
				break;
			case 7:
				inverter(vet, posFim);
				break;
			case 8:
				System.out.println(" __ FIM __ ");
				break;
			default:
				System.out.println(" .. opção inválida .. ");
				break;
			}

		} while (opcao != 8);
	}


	private int incluir(int vet[], int posFim, Scanner scan) {

		if (posFim < vet.length) {
			System.out.print(" valor: ");
			vet[posFim] = scan.nextInt();

			System.out.println("_ incluído em vet[" + posFim + "].");
			posFim++;
		} else {
			System.out.println(" .. não incluído - vetor cheio .. ");
		}

		return posFim;
	}


	private int pesquisar(int vet[], int posFim, Scanner scan) {

		System.out.print(" valor pesquisa: ");
		int valor = scan.nextInt();

		for (int i = 0; i < posFim; i++) {

			if (valor == vet[i]) {
				System.out.println("_ encontrado vet[" + i + "]");
				return i;
			}
		}

		System.out.println("_ Não encontrado.");

		return -1;
	}

	private void alterar(int vet[], int posFim, Scanner sc) {

		int valorId = pesquisar(vet, posFim, sc);

		if (valorId != -1) {
			System.out.print(" valor troca: ");
			vet[valorId] = sc.nextInt();

			System.out.println("_ valor troca vet[" + valorId + "]: " + vet[valorId]);
		}
	}

	private int excluir(int vet[], int posFim, Scanner sc) {

		int valorId = pesquisar(vet, posFim, sc);

		if (valorId != -1) {
			for (int i = valorId; i < (posFim - 1); i++) {
				vet[i] = vet[i + 1];
			}

			posFim--;
			System.out.println("_ valor excluído.");
		}

		return posFim;
	}


	private void mostrar(int vet[], int posFim) {

		System.out.println(" __ vetor valores __ ");

		for (int i = 0; i < posFim; i++) {
			System.out.println("vet[" + i + "] " + vet[i]);
		}
	}


	private void ordenar(int vet[], int posFim) {

		int bolha;

		for (int i = 0; i < posFim - 1; i++) {

			if (vet[i] > vet[i + 1]) {
				bolha = vet[i];
				vet[i] = vet[i + 1];
				vet[i + 1] = bolha;
				i = -1;
			}
		}

		System.out.println("_ valores ordenados.");
	}


	private void inverter(int vet[], int posFim) {

		int temp = 0;
        
		for (int i = 0; i < posFim; i++) {
			for (int x = 0; x < i; x++) {
				temp = vet[i];
				vet[i] = vet[x];
				vet[x] = temp;
			}
		}
	}

	public static void main(String[] args) {
		new Uni6Exe10();
	}

}
