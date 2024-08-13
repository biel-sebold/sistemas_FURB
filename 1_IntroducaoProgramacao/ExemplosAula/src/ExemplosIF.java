import java.util.Scanner;

public class ExemplosIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

         if (num % 2 == 0) {
            System.out.println("O número é par");
        }
        System.out.println("FIM"); 

        
        // //DESAFIO escrever um número conferir se é par e depois se é maior que 1000 (sem usar else)

        //  System.out.print("Informe um número: ");
        //  int num = sc.nextInt();
       

        // if (num % 2 == 0) {
        //     System.out.println("O número é par");
        //     if (num >1000) {
        //        System.out.println("O número é maior que 1000");

        //     }
        // }
        // System.out.println("Fim"); 

        sc.close();


        
        

    }
    
}
