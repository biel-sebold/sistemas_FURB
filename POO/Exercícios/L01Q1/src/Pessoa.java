package POO.Exercícios.L01Q1.src;

public class Pessoa {
    double altura;
    double peso;

    public double calcularImc() {
        double result = peso / (Math.pow(altura, 2));
        return result;
    }

}
