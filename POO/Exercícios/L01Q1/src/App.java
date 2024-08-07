package POO.Exercícios.L01Q1.src;

public class App {
    public static void main(String[] args) {

        Pessoa gabriel = new Pessoa();

        gabriel.peso = 78;
        gabriel.altura = 1.75;

        System.out.printf("IMC: %.1f", gabriel.calcularImc());

        

        
    }
}
