import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        //MEIO DANTON
        //Uma turma tem em alunos. Dado n , o nome e idade de cada aluno descreva um algoritmo que:
        // escreva os nomes dos alunos que têm 18 anos;
        // escreva a quantidade de alunos que têm idade acima de 20 anos.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de alunos: ");
        int n = sc.nextInt();

        int quantidade = 0;
        String nomes18 = "";

        for(int i = 1; i <= n; i++){

            System.out.print("Escreva o nome do aluno: ");
            String nome = sc.next();

            System.out.print("Escreva a sua idade: ");
            int idade = sc.nextInt();

            if (idade == 18) {
                nomes18 += nome + " ";

            } else if (idade > 20) {
                quantidade++;
                
            }

        }  
        
        System.out.printf("Alunos com 18 anos: %s\n", nomes18);
        System.out.printf("Alunos com mais 20 anos: %s", quantidade++);

        sc.close();
    }

}
