import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        //Uma emissora de rádio decidiu promover uma eleição para determinar o melhor conjunto do ano segundo a opinião dos ouvintes. Entraram na disputa apenas os quatro conjuntos mais solicitados durante o ano. Os votos são informados através de códigos:
// 1	Nenhum de Nós
// 2	CPM22
// 3	Skank
// 4	Jota Quest

        // Descreva um algoritmo que:
                // informe o total de votos para cada grupo;
                // informe o percentual dos votos para cada grupo;
                // informe o grupo vencedor.
        // O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados.

        Scanner sc = new Scanner(System.in);

        char voto = ' ';

        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int total = 0;

        while (voto != 'n') {
            System.out.print("\n\n1 - Nenhum de nós\n2- CPM22\n3- Skank\n4- Jota Quest\n Informe uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    voto1++;
                    total++;
                    break;

                case 2:
                    voto2++;
                    total++;
                    break;

                case 3:
                    voto3++;
                    total++;
                    break;

                case 4:
                    voto4++;
                    total++;
                    break;
            
                default:
                System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }

            System.out.print("\nmais um voto: s (SIM) / n (NÃO)?");
            String entrada = sc.next().toLowerCase();
            voto = entrada.charAt(0);   
        }

        System.out.println("\n\n\n*****TOTAL DE VOTOS*****\n");

        System.out.printf("NENHUM DE NÓS: %d votos\n", voto1);
        System.out.printf("PERCENTUAL DE VOTOS: %.1f%%\n", (voto1 / (double)total * 100));

        System.out.printf("CPM22: %d votos\n", voto2);
        System.out.printf("PERCENTUAL DE VOTOS: %.1f%%\n", (voto2 / (double)total * 100));

        System.out.printf("SKANK: %d votos\n", voto3);
        System.out.printf("PERCENTUAL DE VOTOS: %.1f%%\n", (voto3 / (double)total * 100));

        System.out.printf("JOTA QUEST: %d votos\n", voto4);
        System.out.printf("PERCENTUAL DE VOTOS: %.1f%%\n", (voto4 / (double)total * 100));

//AJUDADO
        int vencedor = Math.max(Math.max(voto1, voto2), Math.max(voto3, voto4));

        System.out.print("\n\n*****GRUPO VENCEDOR*****\n");

        if (vencedor == voto1) {
            System.out.println("NENHUM DE NÓS");
        } else if (vencedor == voto2) {
            System.out.println("CPM22");
        } else if (vencedor == voto3) {
            System.out.println("SKANK");
        } else {
            System.out.println("JOTA QUEST");
        }

        sc.close();

    }
}
