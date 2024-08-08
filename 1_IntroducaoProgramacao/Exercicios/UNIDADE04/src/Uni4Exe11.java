import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        //Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escreva uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades foram diferentes.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento do primeiro irmão: ");
        int irmao1 = sc.nextInt();

        System.out.print("Informe o ano de nascimento do segundo irmão: ");
        int irmao2 = sc.nextInt();

        System.out.print("Informe o ano de nascimento do terceiro irmão: ");
        int irmao3 = sc.nextInt();

        if (irmao1 == irmao2 && irmao1 == irmao3) {
            System.out.println("TRIGÊMEOS");
            
        } else if (irmao1 == irmao2 && irmao1 != irmao3 || irmao1 == irmao3 && irmao1 != irmao2 ) {
            System.out.println("GÊMEOS");
            
        } else{
            System.out.println("APENAS IRMÃOS");
        }

        sc.close();

        
    }
    
}
