package EXERCICIOS.src.UNIDADE02;
import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        //Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante comprar uma determinada quantidade de cada formato, informe quantos litros de refrigerante ele comprou.

        Scanner dig = new Scanner(System.in);

        System.out.print("Informe quantas latas de 350ml comprou: ");
        int latas = dig.nextInt();
        double quantidadeLatas = latas * .35;

        System.out.print("Informe quantas garrafas de 600ml comprou: ");
        int garrafas = dig.nextInt();
        double quantidadeGarrafas = garrafas * .6;

        System.out.print("Informe quantas garrafas de 2L comprou: ");
        int garrafas2 = dig.nextInt();
        int quantidadeGarrafas2 = garrafas2 * 2;

        double total = quantidadeLatas + quantidadeGarrafas + quantidadeGarrafas2;
        System.out.print("O total de litros de refirgerante comprados foi: " + total + "litros");

        dig.close();

    }
    
}
