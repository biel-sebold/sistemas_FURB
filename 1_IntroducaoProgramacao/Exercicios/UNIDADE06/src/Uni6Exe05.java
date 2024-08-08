import java.util.Scanner;

//Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um respondeu um questionário com 5 perguntas, como por exemplo:
    // Gosta de música sertaneja?
    // Gosta de futebol?
    // Gosta de seriados?
    // Gosta de redes sociais?
    // Gosta da Oktoberfest?
// A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:

    // se ambos deram a mesma resposta soma-se 3 pontos ao índice;
    // se um respondeu IND e o outro SIM ou NÃO soma-se 1;
    // se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
// Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a afinidade.



public class Uni6Exe05 {

    private Uni6Exe05() {
        Scanner sc = new Scanner(System.in);

        String perguntas[] = {"Gosta de música sertaneja", 
                             "Gosta de futebol",
                             "Gosta de seriados",
                             "Gosta de redes sociais",
                             "Gosta da Oktoberfest"};

        String respostasR[] = ler(sc, perguntas, "Rapaz");
        String respostasG[] = ler(sc, perguntas, "Garota");
        int afinidade = calcular(respostasR, respostasG);
        String status = determinar(afinidade);
        System.out.println(status);
    }


    private String[]ler(Scanner scan, String perguntas[], String id) {

        String respostas[] = new String[perguntas.length];

        System.out.printf("\n*** RESPOSTAS DO(A) - %scan *** \n", id);

        for(int i = 0; i < perguntas.length; i++) {
            System.out.printf("%scan: \n", perguntas[i]);
            respostas[i] = scan.next().toUpperCase();
        }

        return respostas;
    }


    private int calcular(String respostasR[], String respostasG[]) {

        int afinidade = 0;

        for(int i = 0; i < respostasG.length; i++) {

            if (respostasG[i].equals(respostasR[i])) {
                afinidade += 3;

            } else if 
            ((respostasG[i].equals("IND") && 
                (respostasR[i].equals("SIM") || 
                respostasR[i].equals("NÃO")
                ))
            ||        
             (respostasG[i].equals("IND") &&
                (respostasR[i].equals("SIM") ||
                respostasR[i].equals("NÃO")
                ))
            ) {

                afinidade += 1;

            } else if 
            ((respostasR[i].equals("SIM") && respostasG[i].equals("NÃO")) ||
             (respostasG[i].equals("SIM") && respostasR[i].equals("NÃO")) 
            ) {

                afinidade -= 2;
                
            }

        }

        return afinidade;
    }


    private String determinar(int afinidade) {

        if (afinidade == 15) {
            return "\n\nCasem!!!";
            
        } else if (afinidade >= 10) {
            return "\n\nVocês têm muita coisa em comum";
            
        } else if (afinidade >= 5) {
            return "\n\nTalvez não dê certo :(";
            
        } else if (afinidade >= 0) {
            return "\n\nVale um encontro.";
            
        } else if (afinidade >= -9) {
            return "\n\nMelhor não perder tempo";
            
        } else {
            return "\n\nVocês se odeiam!";
        }
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }



}
