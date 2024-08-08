import java.util.Scanner;

public class ExtrasExe05 {
    public static void main(String[] args) {
        //Um produto vai sofrer aumento de acordo com a tabela abaixo. Leia o preço antigo, calcule e escreva o preço novo, e escreva uma mensagem em função do preço novo (de acordo com a 2a tabela).

// PREÇO ANTIGO (até R$ 50)
// PERCENTUAL DE AUMENTO  (5%)

// PREÇO ANTIGO  (entre R$ 50 e R$ 100)
// PERCENTUAL DE AUMENTO (10%)

// PREÇO ANTIGO (acima de R$ 100)
// PERCENTUAL DE AUMENTO  (15%)


// PREÇO NOVO (até R$ 80)
// MENSAGEM  (Barato)

// PREÇO NOVO (entre R$ 80 e R$ 120 (inclusive))
// MENSAGEM (Normal)

// PREÇO NOVO (entre R$ 120 e R$ 200 (inclusive))
// MENSAGEM (Caro)

// PREÇO NOVO (acima de R$ 200)
// MENSAGEM (Muito caro)

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço pago pelo produto: R$");
        double preco = sc.nextDouble();
        float aumento;
        double precoNovo;

        if (preco < 50) {
            aumento = (float) (preco * 0.5);
            precoNovo = preco + aumento;
            
        } else if (preco > 50 && preco < 100) {
            aumento = (float) (preco * 0.10);
            precoNovo = preco + aumento;
            
        } else{
            aumento = (float) (preco * 0.15);
            precoNovo = preco + aumento;
        }

        System.out.printf("O preço novo será: R$ %.2f\n", precoNovo);

        if (precoNovo < 80) {
            System.out.println("Barato");
            
        } else if (precoNovo > 80 && precoNovo <= 120) {
            System.out.println("Normal");
            
        } else if (precoNovo > 120 && precoNovo <= 200) {
            System.out.println("Caro");
            
        } else{
            System.out.println("Muito caro");
        }

        sc.close();

    }

}
