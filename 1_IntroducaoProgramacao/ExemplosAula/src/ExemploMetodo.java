public class ExemploMetodo {

    private ExemploMetodo() { 
        mostraMenu("Principal");
        System.out.println(soma (2, 6));
        System.out.println(soma(10, 30));

        int r = soma(10, 5);
        System.out.println(r);

        int s = soma(soma(90, 30), soma(20, 30));
        System.out.println(s);

        // mostraMenu("Teste");
        // mostraMenu("Outro menu");
    }
    //TODA A LÓGICA VAI NO CONSTRUTOR / A PARTIR DAÍ QUE CRIO MEUS DEMAIS MÉTODOS


    private int soma(int n1, int n2) { //MÉTODO COM RETORNO (TIPO PRIMITIVO)
        return n1 + n2; 
    }


    private void mostraMenu(String titulo){ //MÉTODO SEM RETORNO NENHUM (VOID)
        System.out.printf("\n\n***** MENU %s *****\n", titulo);
        System.out.println("Opção 1: blablabla");
        System.out.println("Opção 2: trelele");
        System.out.println("Opção 3: tititi");
        System.out.println("Opção 4: cucucucu");
        System.out.println("Informe a opção: ");      
    }

    public static void main(String[] args) {
        new ExemploMetodo();
        
       
    }

}
