/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA03.questao01;

/**
 *
 * @author Almir
 */
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

    public double calcularIrpf() {

        double imposto = 0;
        double diferenca = 0;

        if (salario > 1903.98) { 

            //FAIXA 2
            if (salario <= 2826.65) {
                diferenca = salario - 1903.98;
                imposto = diferenca * (7.5 / 100);
                
            } else if (salario <= 3751.05) { //FAIXA 3
                //calcula da faixa 2
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5 / 100);

                //calcula da faixa 3
                diferenca = 3751.05 - 2826.65;
                imposto += diferenca * (15.0/100);

            } else if (salario <= 4664.68) {
                //calcula da faixa 2
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5 / 100);

                //calcula da faixa 3
                diferenca = 3751.05 - 2826.65;
                imposto += diferenca * (15.0/100);

                //calcula da faixa 4
                diferenca = salario - 3751.05;
                imposto += diferenca * (22.5 / 100);
                
            } else {
               // Calcular da faixa 2
               diferenca = 2826.65 - 1903.98;
               imposto = diferenca * (7.5/100);
               
               // Calcular da faixa 3
               diferenca = 3751.05 - 2826.65;
               imposto += diferenca * (15.0/100);
               
               // Calcular da faixa 4
               diferenca = 4664.68 - 3751.05;
               imposto += diferenca * (22.5/100);
               
               diferenca = salario - 4664.68;
               imposto += diferenca * (27.5/100);
            }  
        }  
        return imposto;
    }
    
}
