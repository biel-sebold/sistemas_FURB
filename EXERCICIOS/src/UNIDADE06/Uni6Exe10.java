package EXERCICIOS.src.UNIDADE06;

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
    }
   

}
