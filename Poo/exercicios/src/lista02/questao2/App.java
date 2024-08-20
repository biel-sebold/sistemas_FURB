package Poo.exercicios.src.lista02.questao2;

import java.util.Scanner;

//Com intuito de representar contas bancárias, implemente o diagrama de classes abaixo:

// 1. O método getNumero() deve ser o método getter da variável de instância numero.
// 2. O método setNumero() deve ser o método setter da variável de instância numero.
// 3. O método getTitular() deve ser o método getter da variável de instância titular.
// 4. O método setTitular() deve ser o método setter da variável de instância titular.
// 5. O método getSaldo() deve ser o método getter da variável de instância saldo.
// 6. O método depositar() deve acrescentar valores ao saldo da conta bancária. O método depositar() deve
// recusar tentativas de depósito com valor negativo.
// 7. O método sacar() deve subtrair valores do saldo da conta bancária. O método sacar() deve recusar tentativas
// de saque com valor negativo. Também deve recusar tentativas de saque que causem o saldo ficar negativo.
// 8. O método transferir() deve ser implementado para transferir valores de uma conta bancária para outra.
// Considerar que a conta de origem é a conta onde será invocado o método transferir(), enquanto que a conta
// de destino será fornecida como argumento para o método transferir(). O valor a ser transferido também é
// fornecido como argumento.

// 9. Crie um programa (classe App) que solicite ao usuário o número e titular de duas contas bancárias. Em seguida,
// efetue as seguintes operações:
// a. Realize depósitos na primeira conta nos valores de R$ 1.000,00 e R$ 700,00.
// b. Realize depósitos na segunda conta nos valores de R$ 5.000,00.
// c. Faça um saque na 2ª conta no valor de R$ 3.000,00.
// d. Transfira R$ 1.800,00 da 2ª conta para a 1ª conta.
// e. Exiba o titular de cada uma conta com o respectivo saldo da conta.

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    

        System.out.print("Informe o número da conta 1: ");
        String numero1 = sc.next();

        System.out.print("Informe o titular da conta 1: ");
        String titular1 = sc.next();


        System.out.print("\nInforme o número da conta 2: ");
        String numero2 = sc.next();

        System.out.print("Informe o titular da conta 2: ");
        String titular2 = sc.next();

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.setNumero(numero1);
        conta1.setTitular(titular1);
        conta2.setNumero(numero2);
        conta2.setTitular(titular2);

    
        conta1.depositar(1000);
        conta1.depositar(700);

        conta2.depositar(5000);

        conta2.sacar(3000);

        conta2.transferir(conta1, 1800);

        System.out.println("\n\n>>>RESULTADO<<<\n\n");
        System.out.printf("TITULAR: %s\nSALDO: R$%.1f", titular1,);
        System.out.printf("\n\nTITULAR: %s\nSALDO: R$%.1f", titular2,);

        // sc.close();
    }
}
