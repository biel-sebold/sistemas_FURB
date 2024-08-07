package POO.Exercicios.src.LISTA01.questao4;

public class Pessoa {
    String nome;
    double altura;
    double peso;

    public Pessoa(String nome, double altura, double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularImc() {
        double result = peso / (Math.pow(altura, 2));
        return result;
    }

}
