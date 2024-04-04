package EXERCICIOS.src.UNIDADE04;
import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
    //AJUDADO//
    //Faça um algoritmo que leia um caractere. Caso seja digitado a letra 'M' escreva “Masculino”. Se for digitado a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para guardas.

    Scanner sc = new Scanner(System.in);

    System.out.print("Informe seu sexo: ");

    char caractere = sc.nextLine().toUpperCase().charAt(0);

    if (caractere == 'M') {
        System.out.println("Masculino");
        
    } else if(caractere =='F') {
        System.out.println("Feminino");

    } else if(caractere == 'I'){
        System.out.println("Não informado");
    } else {
        System.out.println("Entrada incorreta");
    }




    
}
}