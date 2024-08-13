import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//==================================================================================================================
//LÊ NÚMEROS E DEPOIS MOSTRA
        // int numeros[] = new int[10];

        // for(int i = 0; i < numeros.length; i++) {
        //     System.out.printf("Informe n° %d: ", i );
        //     numeros[i] = sc.nextInt();

        // }

        // for(int i = 0; i < numeros.length; i++) {
        //     System.out.println(numeros[i]);
        // }

//==========================================================================================================   


//ARMAZENAR SALARIOS PRÉ DECLARADOS E MOSTRA

        // float[] salarios = new float[3];
        // salarios[0] = (float) 1000.00; //EXEMPLO1 (melhor)
        // salarios[1] = 1450.0F;//EXEMPLO2
        // salarios[2] = (float) 10954.53;
        
        // for(int i = 0; i < salarios.length; i++) {
        //     System.out.println(salarios[i]);

        // }


//==========================================================================================================

//CRIE UM VETOR DE 50 POSIÇÕES, PREENCHA COM NÚMEROS ALEATÓRIOS (0 a 1000) E ACHE O MAIOR 

        // int numeros[] = new int[50];

        // for(int i = 0; i < numeros.length; i++) {
        //     numeros[i] = (int)(Math.random() * 1001);

        // }

        // int maior = Integer.MIN_VALUE;

        // for(int i = 0; i < numeros.length; i++) {

        //     if (numeros[i] > maior) {
        //         maior = numeros[i];
                
        //     }
        // }

        // System.out.printf("Maior número: %d\n", maior);

        // for(int numero : numeros) {
        //     System.out.printf("%d, ", numero );
        // }

            
        sc.close();    

    }

}
