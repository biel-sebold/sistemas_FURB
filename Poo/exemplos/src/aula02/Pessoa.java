package Poo.exemplos.src.aula02;

public class Pessoa {

    double altura;
    double peso;
    String nome;
    
    double calcularImc() {
        return peso / (altura * altura);
    }


}
