package Poo.exercicios.src.lista02.questao2;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }


    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }


    public double getSaldo(){
        return this.saldo;
    }


    public void depositar(double valor){

        if (valor < 0) {
            throw new IllegalAccessError("VALOR NÃO PERMITIDO"); 
        } 

        this.saldo += valor;
    }

    public void sacar (double valor){

        if (valor < 0 || valor > this.saldo) {
            throw new IllegalAccessError("VALOR NÃO PERMITIDO");
        }

        this.saldo -= valor;
    }


    public void transferir(ContaBancaria contaDestino, double valor){

        this.sacar(valor);     //PEGA SALDO DO OBJETO
        contaDestino.depositar(valor);

    }



}