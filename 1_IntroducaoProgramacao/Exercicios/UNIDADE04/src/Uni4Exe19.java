import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        //DIAGRAMA//
        //Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado
// 0, se os dois valores são zero
// 1, se os dois valores são positivos
// 2, se x para positivo e y, negativo
// 3, se os dois valores são negativos
// 4, se x para negativo e y, positivo

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de X: ");
        float x = sc.nextFloat();

        System.out.println("Informe o valor de Y: ");
        float y = sc.nextFloat();

        int quadrante;

        if (x == 0 && y == 0) {
            quadrante = 0;
            
        } else if (x > 0 && y > 0) {
            quadrante = 1;
            
        } else if (x > 0 && y < 0) {
            quadrante = 2;
            
        } else if (x < 0 && y < 0) {
            quadrante = 3;
            
        } else{
            quadrante = 4;
            
        }

        System.out.printf("O ponto com as coordenadas X = %.1f / Y = %.1f está no quadrante %d", x, y, quadrante);

        sc.close();
    }

}
