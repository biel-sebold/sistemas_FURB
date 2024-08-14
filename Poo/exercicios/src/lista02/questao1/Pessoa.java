package Poo.exercicios.src.lista02.questao1;

public class Pessoa {

    String nome;
    double altura;
    double peso;

    public String getNome(){
        return this.nome;

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(){
        
    }

    
    public Pessoa(String nome, double altura, double peso){ //construtor
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularImc() {
        double result = peso / (Math.pow(altura, 2));
        return result;
    }

}
