import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        //Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor diário conforme as regras descritas abaixo. Escreva um programa para ler o dia do mês de abril que será calculado o valor diário. O programa deve validar a leitura do dia de forma a aceitar apenas valores válidos para o mês de Abril (1 a 30). Caso o dia seja inválido, escrever a mensagem "Dia inválido" e repetir a leitura até que seja válido. A seguir deve ser lido o total de peças produzidas pelo funcionário no turno da manhã e o total de peças produzidas no turno da tarde. Escrever o valor que o respectivo funcionário receberá no dia. Logo após exibir a mensagem "Novo funcionário (1.sim 2.não)?". Caso a resposta seja 1 o programa deve ser repetido solicitando novamente o dia do mês e a produção de peças do funcionário em cada turno, caso contrário deve ser encerrado.

// Regras:
        // para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde), desde que a produção em cada um dos turnos não seja inferior a 30. Caso contrário recebe R$ 0,50 por peça.
        // para a segunda quinzena do mês (16 a 30) o funcionário recebe R$ 0,40 por peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da tarde.

// Considere que a produção em cada turno nunca será a mesma (não é necessário validar) Responda também:
        // qual dia ocorreu a maior produção;
        // em qual período o funcionário mais produz (manhã ou tarde e a quantidade produzida).

        Scanner sc = new Scanner (System.in);

        int novo = 0;
        int maior = Integer.MIN_VALUE;
        int diaMaior = 0;
        int manha = 0;
        int tarde = 0;
        double salario = 0; //AJUDADO

        while (novo != 2) {

            System.out.print("\nInforme o dia do mês (Abril): ");
            int dia = sc.nextInt();

            while (dia < 1 || dia > 30) {
                System.out.println("\nDIA INÁLIDO");
                System.out.print("\nInforme o dia do mês (Abril): ");
                dia = sc.nextInt();
            }

            System.out.print("Informe o total de peças produzidas pela manhã: ");
            int pecasM = sc.nextInt();
            manha+=pecasM;

            System.out.print("Informe o total de peças produzidas pela tarde: ");
            int pecasT = sc.nextInt();
            tarde+=pecasT;

            int soma = pecasM + pecasT;

            if (soma > maior) {
                maior = soma;
                diaMaior = dia; //AJUDADO
            }

            if (dia >= 1 && dia <= 15) {
                if (soma > 100 && pecasM > 30 && pecasT > 30) {
                    salario = soma * 0.80;
                    
                } else {
                    salario = soma * 0.50;

                }
            }

            if (dia >= 16 && dia <= 30) {
                salario = (pecasM * 0.40) + (pecasT * 0.30);
                
            }    

            System.out.printf("\nSalário(%02d/04): R$%.2f\n", dia, salario);

            System.out.print("\nNovo funcionário (1. sim) (2. não)?");
            novo = sc.nextInt();
                
        }

        System.out.printf("\nDIA DE MAIOR PRODUÇÃO: %02d/04 (%d peças)", diaMaior, maior);

        if (manha > tarde) {
            System.out.printf("\nPERÍODO MAIS PRODUTIVO: Manhã (%d peças)", manha); //AJUDADO
            
        } else {
            System.out.printf("\nPERÍODO MAIS PRODUTIVO: Tarde (%d peças)", tarde); //AJUDADO
        }

        sc.close();
    }

}
