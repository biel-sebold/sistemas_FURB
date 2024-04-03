package src;

public class ExemploIFEOU {
    public static void main(String[] args) {
        //EXEMPLO VERDADEIRO
        int a = 0;
        int b = 0;

        if ((a == 0 && b == 0) || a>0) {
            System.out.println("entrei");
        }
        


        //EXEMPLO FALSO
        // int a = 0;
        // int b = 0;

        // if ((a == 0 && b == 1) || a>0) {
        //     System.out.println("entrei");
        // }



        // //EXEMPLO OU EXCLUSIVO(^);
        // int a = 0;
        // int b = 0;

        // if (a == 0 ^ b == 0) {
        //     System.out.println("entrei");
            
        // }



        //EXEMPLO NOT
        // int a = 0;
        // int b = 0;

        // if (!(a == 0 ^ b == 0)) {
        //     System.out.println("entrei");
            
        // }
    }
    
}
