import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        //Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:
// R$ 7,50 por diária, caso o número de diárias seja menor que 15;
// R$ 6,50 por diária, caso o número de diárias seja igual a 15;
// R$ 5,00 por diária, caso o número de diárias seja maior que 15.

        // Descreva um algoritmo que apresente as seguintes opções ao recepcionista:
// (1) encerrar a conta de um hóspede;
// (2) verificar número de contas encerradas;
// (3) sair.

        // Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a ser pago. Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). Caso a opção escolhida seja a terceira finalize a execução do algoritmo.

        Scanner sc = new Scanner(System.in);

        double total = 0;
        int encerradas = 0;

        System.out.println("*** OPÇÕES ***\n");
        System.out.print("(1) Encerrar a conta do hóspede\n" +
                        "(2) Verificar número de contas encerradas\n" +
                        "(3) Sair\n" +
                        "Escolha uma opção: ");
        int opcao = sc.nextInt();

        do {
            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o nome do hóspede: ");
                    String nome = sc.next();

                    System.out.print("Informe o número de diárias: ");
                    int diarias = sc.nextInt();

                    if (diarias < 15) {
                        total = (diarias * 50) + (diarias * 7.5);
                        
                    } else if (diarias == 15) {
                        total = (diarias * 50) + (diarias * 6.5);
                        
                    } else{
                        total = (diarias * 50) + (diarias * 5);
                    }

                    System.out.printf("\nHÓSPEDE: %s\nTOTAL A PAGAR: R$%.2f\n\n", nome, total);

                    encerradas++;
                    break;

                case 2:
                    System.out.printf("\nNÚMERO DE CONTAS ENCERRADAS: %d\n", encerradas);   
                    break; 

                case 3:
                    return;    
            
                default:
                    System.out.println("!!! OPÇÃO INCORRETA !!!");
                    break;
            }

            System.out.println("\n\n*** OPÇÕES ***\n");
            System.out.println("(1) Encerrar a conta do hóspede" +
                            "(2) Verificar número de contas encerradas" +
                            "(3) Sair");
            opcao = sc.nextInt();                
                
        } while (opcao != 3);

        sc.close();


    }
}    
