package Poo.exemplos.src.aula03;

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
