package Poo.exercicios.src.lista01.questao1;

public class Pessoa {
    double altura;
    double peso;

    public double calcularImc() {
        double result = peso / (Math.pow(altura, 2));
        return result;
    }

}
