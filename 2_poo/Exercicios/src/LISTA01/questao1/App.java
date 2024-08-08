package POO.Exercicios.src.LISTA01.questao1;

public class App {
    public static void main(String[] args) {

        //O método calcularImc() da classe Pessoa deverá calcular o IMC da pessoa, usando a fórmula: p/h^2
        //No método main() da classe App utilize a classe Pessoa para calcular o IMC de uma pessoa que tem 1,75 m de altura e 78 Kg. O programa deverá apresentar o IMC calculado na tela.

        Pessoa gabriel = new Pessoa();

        gabriel.peso = 78;
        gabriel.altura = 1.75;

        System.out.printf("IMC: %.1f", gabriel.calcularImc());

        

        
    }
}
