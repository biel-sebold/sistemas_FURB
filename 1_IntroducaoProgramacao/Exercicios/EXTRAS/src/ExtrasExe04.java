import java.util.Scanner;

public class ExtrasExe04 {
    public static void main(String[] args) {
        //Você resolveu dar uma força para a NASA, que deseja calcular o peso das pessoas em diferentes planetas do sistema solar. (Isso vai ter importantes consequencias na expansão da humanidade pelos planetas). Escreva um algoritmo que recebe o peso de uma pessoa (em Newtons) e calcula o novo peso nos corpos celestes, de acordo com as conversões gravitacionais de cada planeta (estas constantes estão normalizadas em relação à constante da Terra), dadas abaixo:
// Mercúrio (0.3649337410)
// Vênus (0.9041794087)
// Marte (0.3812436289)
// Lua (0.1651376146)
// Terra (1)
// Júpiter (2.6513761467)
// Saturno (1.1386340468)
// Urano (1.0693170234)
// Netuno (1.3506625891)
// Plutão (0.2252803261)

       // Depois de fazer as conversões, informe o quanto as pessoas pesariam se estivessem na Terra

       Scanner sc = new Scanner(System.in);

       System.out.print("Informe o peso da pessoa em newtowns: ");
       float pesoN = sc.nextFloat();
       float pesoKg = pesoN / 10;

       System.out.println("Escolha uma opção: ");
       System.out.println("1- Mercúrio\n2- Vênus\n3- Marte\n4- Lua\n5- Júpiter\n6- Saturno\n7- Urano\n8- Netuno\n9- Plutão");

       int opcao = sc.nextInt();
       double planeta;

       switch (opcao) {
        case 1:
            planeta = pesoKg *0.3649337410;
            System.out.printf("O peso em Mercúrio será: %.1fkg", planeta);
            
            break;
        case 2:
            planeta = pesoKg * 0.9041794087;
            System.out.printf("O peso em Vênus será: %.1fkg", planeta);
            
            break;
        case 3:
            planeta = pesoKg *0.3812436289;
            System.out.printf("O peso em Marte será: %.1fkg", planeta);
            
            break;
        case 4:
            planeta = pesoKg * 0.1651376146;
            System.out.printf("O peso na Lua será: %.1fkg", planeta);
            
            break;
        case 5:
            planeta = pesoKg * 2.6513761467;
            System.out.printf("O peso em Júpiter será: %.1fkg", planeta);
            
            break;
        case 6:
            planeta = pesoKg * 1.1386340468;
            System.out.printf("O peso em Saturno será: %.1fkg", planeta);
            
            break;
        case 7:
            planeta = pesoKg * 1.0693170234;
            System.out.printf("O peso em Urano será: %.1fkg", planeta);
            
            break;
        case 8:
            planeta = pesoKg * 1.3506625891;
            System.out.printf("O peso em Netuno será: %.1fkg", planeta);
            
            break;
        case 9:
            planeta = pesoKg * 0.2252803261;
            System.out.printf("O peso em Plutão será: %.1fkg", planeta);
            
            break;
       
        default:
            System.out.println("Opção inválida");

            break;
       }

       float pesoTerra = pesoKg;
       System.out.printf("\tO peso na Terra será: %.1fkg", pesoTerra);

       sc.close();



    }

}
