package EXERCICIOS.src.UNIDADE05;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        //BELLETTI
        //Escreva um programa que imprime um calendário para um determinado mês. O calendário deve conter cada dia do mês e o dia da semana correspondente. A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro especificando o número de dias que o mês possui.
        // Exemplo: p = 3 n = 31

        Scanner sc = new Scanner(System.in);

        int primeiroDia, mes = 0;

        while(true){

            System.out.print("(1) DOMINGO | (2) SEGUNDA | (3) TERÇA | (4) QUARTA | (5) QUINTA | (6) SEXTA | (7) SÁBADO" + "Informe quando cai o primeiro dia do mês: ");
            primeiroDia = sc.nextInt();
    
            System.out.print("Informe quantos dias o mês possui: ");
            mes = sc.nextInt();
          
            if(primeiroDia > 7 || primeiroDia <1 || mes > 31 || mes < 28){
                System.out.println("PRIMEIRO DIA OU NÚMERO DE DIAS INVÁLIDO!!!\nPRIMEIRO DIA: 1-7 | DIAS: 28 - 31");

            }else{
                break;
            }
        }

        int dia = 1;

        System.out.println("\nD   |   S   |   T   |   Q   |   Q   |   S   |   S");

        while (dia <= mes) {

            for (int k = 1; k < dia; k++) {
            System.out.print(" \t");    //espaços vazios antes do primeiro dia
            }

            double espacosVazios = 0;

            for (int i = 1; i <= 6; i++) { //FOR DAS LINHAS
                espacosVazios = 0;
                
                if(i == 1){
                    espacosVazios = primeiroDia-1; //primeira semana tem menos dias que as demais por causa
                }                                  //dos espaços vazios

                for (int j = 1; j <= 7-espacosVazios && dia <= mes; j++) { 
                    System.out.print(dia +"\t");
                    dia++;
                }

                System.out.println(" ");
            }
        }

        sc.close();
    }
}
