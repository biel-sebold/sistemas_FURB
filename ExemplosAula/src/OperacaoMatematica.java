package src;

public class OperacaoMatematica {
    public static void main(String[] args) {

        int numero = 10;
        int quadrado = numero * numero;
        int cubo = numero * numero * numero;

        System.out.println(quadrado);
        System.out.println(cubo);

//POTÊNCIA//
        double resposta = Math.pow(numero, 6);
        //CASTING
        //int resposta = (int)Math.pow(numero, 6);
        System.out.println(resposta);
 
//RAIZ//        
        double raiz =  Math.sqrt(9);
        //double raiz sétima = Math.pow(x, 1/7);
        //double raiz cúbica = Math.pow(x, 1/3);
        System.out.println(raiz);
    }
//CONSTANTES//


        


    
}
