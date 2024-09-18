/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova01;

/**
 *
 * @author Gabriel Sebold dos Santos
 */
public class DiariaBicicleta {
    private int quantidadeHoras;
    private Convenio convenio;
    
    
public enum Convenio {
    CDL,
    NSC,
    ESTUDANTE,
    SEM_CONVENIO;
    
}    
    
public DiariaBicicleta(int quantidadeHoras, Convenio convenio){
    
    if(convenio == null){
          throw new IllegalArgumentException("Convênio não pode ser vazio");
        }
    
        this.convenio = convenio; 
        
        
        if(this.convenio == Convenio.ESTUDANTE && quantidadeHoras < 2){
            throw new IllegalArgumentException("Estudante deve locar no mínimo 2 horas");
        }
        if(quantidadeHoras < 1){
            throw new IllegalArgumentException("Quantidade de horas locadas não pode ser 0");
        }
        
        this.quantidadeHoras = quantidadeHoras;
    
}

public float valorTotalPagar(){

    double desconto = 0;
    int valorHora = 10;
    
    if(quantidadeHoras >= 5 && quantidadeHoras < 10){
        desconto = desconto - (desconto * 0.2);
        }
    
        if(quantidadeHoras >= 10){
            desconto = desconto - (desconto * 0.3);
        }
        
        if(convenio == Convenio.CDL || convenio == Convenio.NSC){
            desconto += desconto - (desconto * 0.05);
        }
        
        if(convenio == Convenio.ESTUDANTE){
            valorHora = 5;
        }
        
        float valorTotal = this.quantidadeHoras * valorHora;
        return valorTotal;
   
    }  

public void setQuantidadeHoras(int horas){   

   if(convenio == Convenio.ESTUDANTE && horas < 2){
            throw new IllegalArgumentException("Estudante deve locar no mínimo 2 horas");
        }
        if(horas < 1){
            throw new IllegalArgumentException("Quantidade de horas locadas não pode ser 0");
        }
        
        this.quantidadeHoras = horas;
}



public int getQuantidadeHoras(){
    return this.quantidadeHoras;
}


public void setConvenio(Convenio convenio){
    this.convenio = convenio;
    
    if (convenio == null) {
            throw new IllegalArgumentException(String.format("Convênio não pode ser vazio"));
            
        }
}

public Convenio getConvenio(){
    return this.convenio;
}
}
