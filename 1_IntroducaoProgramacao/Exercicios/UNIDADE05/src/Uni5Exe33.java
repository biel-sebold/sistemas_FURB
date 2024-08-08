import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        //Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. Os dados utilizados para votação obedecem a seguinte codificação:

        // 1, 2, 3, 4 = voto para o respectivo candidato;
        // 5 = voto nulo;
        // 6 = voto em branco.

        // Elabore um programa que calcule e escreva:

        // total de votos para cada candidato;
        // total de votos nulos;
        // total de votos em branco;
        // percentual dos votos em branco e nulos sobre o total.
        // Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de opção correto. Para interromper a operação, o usuário poderá fornecer o número 0.

        Scanner sc = new Scanner(System.in);

        System.out.println("ELEIÇÃO: ");

        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int voto5 = 0;
        int voto6 = 0;
        int total = 0;
        int voto = 0;

        do {
            System.out.print("\nCandidato 1 | Candidato 2 | Candidato 3 | Candidato 4 | " + 
                                "Voto nulo 5 | Voto em branco 6\n" +
                                "Informe seu voto: ");
            voto = sc.nextInt();

        } while(voto <= 1 && voto >= 6); //BELLETTI

        while (voto != 0) {

            switch (voto) {
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

                case 5:
                    voto5++;
                    total++; 
                    break;

                case 6:
                    voto6++;
                    total++;  
                    break;
            
                default:
                    System.out.println("!!!OPÇÃO INCORRETA!!!");
                    break;    
            }

            System.out.print("\nCandidato 1 | Candidato 2 | Candidato 3 | Candidato 4 | " + 
                                "Voto nulo 5 | Voto em branco 6\n" +
                                "Informe seu voto: ");
            voto = sc.nextInt();

        }

        System.out.println("*** TOTAL DE VOTOS ***");
        System.out.printf("CANDIDATO 1: %d votos\n", voto1);
        System.out.printf("CANDIDATO 2: %d votos\n", voto2);
        System.out.printf("CANDIDATO 3: %d votos\n", voto3);
        System.out.printf("CANDIDATO 4: %d votos\n\n", voto4);

        System.out.println("*** TOTAL VOTOS NULOS ***");
        System.out.printf("%d votos\n\n", voto5);

        System.out.println("*** TOTAL VOTOS EM BRANCO ***");
        System.out.printf("%d votos\n\n", voto6);

        System.out.println("*** PERCENTUAL NULOS/BRANCOS ***");
        System.out.printf("%.2f", (voto5 + voto6) / (double)total * 100);

        sc.close();
    }

}
