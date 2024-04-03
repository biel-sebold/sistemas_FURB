import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        //PROFESSOR
        //O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:
        //IMC=\frac{Massa}{Altura^2}

        // Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a tabela a seguir:

        // < 18,5	Magrez
        // 18,5 - 24,9	Saudável
        // 25,0 - 29,9	Sobrepeso
        // 30,0 - 34,9	Obesidade Grau I
        // 35,0 - 39,9	Obesidade Grau II (severa)
        // >= 40,0	Obesidade Grau III (mórbida)


        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o peso: ");
        float peso = sc.nextFloat();

        System.out.print("Informe altura: ");
        float altura = sc.nextFloat();

        double imc = peso / Math.pow(altura, 2);

        String classificacao = " ";
        if (imc < 18.5) {
            classificacao = "Magreza";
            
        } else if (imc < 25) {
            classificacao = "Saudável";
            
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
            
        }

    }
    
}
