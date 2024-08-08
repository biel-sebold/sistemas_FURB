import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        //Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. O algoritmo deve exibir uma mensagem de erro se houver uma opção inválida. O menu tem as seguintes opções:
// 1 - Soma de dois números.
// 2 - Diferença entre dois números.
// 3 - Produto entre dois números.
// 4 - Divisão entre dois números (o denominador não pode ser zero).

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva dois números: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma\n2 - Diferença\n3 - Produto\n4 - Divisão");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
            if (num2 == 0) {
                System.out.println("Opção inválida\nO denominador não pode ser zero");
                
            } else{
                System.out.println(num1 / num2);
            }
                break;
        
            default:
            System.out.println("Opção inválida");
                break;
        }

        sc.close();


    }

}
