package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.*;

public class FinancasController {

    private List<Lancamento> lancamentos = new ArrayList<>();

    public void adicionarLancamento(Lancamento lancamento){
        this.lancamentos.add(lancamento);
    }

    public double calcularSaldoAte(LocalDate data){
        List<Lancamento> lancAteData = new ArrayList<>();
        for(Lancamento lanc : this.lancamentos){
            if(data.isAfter(lanc.getData())){
                lancAteData.add(lanc);
            }
        }

        double saldo = 0;
        for (Lancamento lanc : lancAteData) {
            saldo += lanc.getValor();
        }

        return saldo;
    }

    public double calcularSaldoTotal(){
        double saldo = 0;
        for (Lancamento lanc : this.lancamentos) {
            saldo += lanc.getValor();
        }

        return saldo;
    }

    public List<Lancamento> listarReceitas(){
        List<Lancamento> receitas = new ArrayList<>();
        for (Lancamento  lanc : this.lancamentos) {
            if(lanc.getTipo() == "Receita"){
                receitas.add(lanc);
            }
        }
        return receitas;
    }
    
    public List<Lancamento> listarDespesas(){
        List<Lancamento> despesas = new ArrayList<>();
        for (Lancamento  lanc : this.lancamentos) {
            if(lanc.getTipo() == "Despesa"){
                despesas.add(lanc);
            }
        }
        return despesas;
    }

    public String listarLancamentosOrdenados(){
        String lista = "";
        Set<LocalDate> datasDistintas = new HashSet<>();
        for (Lancamento lanc : this.lancamentos) {
            datasDistintas.add(lanc.getData());
        } 

        for (LocalDate data : datasDistintas) {
            lista = lista.concat("\nData: "+data.getDayOfMonth()+"/"+data.getMonthValue()+"/"+data.getYear()+":\n");

            for (Lancamento lanc : this.lancamentos) {
                if(lanc.getData() == data){

                    if(lanc.getTipo() == "Despesa"){
                        lista = lista.concat("\nR$"+(lanc.getValor()*-1)+" - "+((Despesa)lanc).getCategoria() +" - "+lanc.getDescricao()+".\n");
                    }
                    if(lanc.getTipo() == "Receita"){
                        lista = lista.concat("\nR$"+lanc.getValor()+" - "+((Receita)lanc).getCategoria() +" - "+lanc.getDescricao()+".\n");
                    }

                }
            }

            lista = lista.concat("Saldo do dia: R$" + calcularSaldoAte(data));    
        }

        return lista;
    }
}
