package EXERCICIOS.src.UNIDADE03;
import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        //Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.

         Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantas latas de 350ml comprou: ");
        int latas = sc.nextInt();
        double quantidadeLatas = latas * .35;

        System.out.print("Informe quantas garrafas de 600ml comprou: ");
        int garrafas = sc.nextInt();
        double quantidadeGarrafas = garrafas * .6;

        System.out.print("Informe quantas garrafas de 2L comprou: ");
        int garrafas2 = sc.nextInt();
        int quantidadeGarrafas2 = garrafas2 * 2;

        double total = quantidadeLatas + quantidadeGarrafas + quantidadeGarrafas2;
        System.out.print("O total de litros de refirgerante comprados foi: " + total + "litros");

    }
}
