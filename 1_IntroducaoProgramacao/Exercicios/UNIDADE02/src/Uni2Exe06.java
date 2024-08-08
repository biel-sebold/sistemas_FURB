import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
     //Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        Scanner dig = new Scanner (System.in);
        System.out.print("Informe o número do funcionário, seu número de horas trabalhadas e o valor que recebe por hora:");

        int numFunc = dig.nextInt(); 
        int numHoras = dig.nextInt(); 
        float valorHora = dig.nextFloat(); 
        float salario = numHoras * valorHora;

        System.out.println("O funcionário " + numFunc + " possui o salário R$" + salario);

        dig.close();
    }
}
