/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Almir
 */
public class ContaBanco {
    
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //MÉTODOS
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC") {
            this.setSaldo(50);
            
        } else if (t == "CP") {
            this.setSaldo(150);
            
        } else {
            System.out.println("ERRO!");
        }
        
        System.out.println("Conta aberta com sucesso!!!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta tem dinheiro");
            
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
            
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!!");
        }
    }
    
    public void depositar(float valor){
        if (this.getStatus()) {
            saldo += valor;
            //this.setSaldo(this.getSaldo() + valor);
            
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
            
        }
    }
    
    public void sacar(float valor){
        if (this.getStatus()) {
            if (saldo  > valor) {
                saldo -= valor;
                System.out.println("Saque realizado na conta de " + this.getDono());
                
            } else {
                System.out.println("Saldo insuficiente");
            }           
        } else {
            System.out.println("Impossível sacar");
        }
        
    }
    
    public void pagarMensal(){
        int valor = 0;
        
        if (this.getTipo() == "CC") {
            valor = 12;
            
        } else if (getTipo() == "CP") {
            valor = 20;
            
        }
        
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso");
        
        } else{
            System.out.println("Impossível pagar");
        }
    }
    //MÉTODOS ESPECIAIS
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
        
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float sal) {
        this.saldo = sal;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
}
