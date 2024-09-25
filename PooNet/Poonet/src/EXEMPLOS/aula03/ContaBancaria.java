/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXEMPLOS.aula03;

/**
 *
 * @author Almir
 */
public class ContaBancaria {
    
    private double saldo;
    
    void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    void depositar(double valor) {
        saldo = saldo + valor;
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }
    
}
