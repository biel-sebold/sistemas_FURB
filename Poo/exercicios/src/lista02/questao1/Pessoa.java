package Poo.exercicios.src.lista02.questao1;

public class Pessoa {

    private String nome;
    private double altura;
    private double peso;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double calcularImc() {
        double result = peso / (Math.pow(altura, 2));
        return result;
    }

}
