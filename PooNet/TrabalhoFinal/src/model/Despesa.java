package model;
import java.time.LocalDate;
import model.enums.CategDespesa;

public class Despesa extends Lancamento{

    private CategDespesa categoria;

    public Despesa(String descricao, Double valor, LocalDate data, CategDespesa categoria){
        super(descricao, valor, data);
        this.categoria = categoria;
    }


    public CategDespesa getCategoria() {
        return categoria;
    }
    
    public void setCategoria(CategDespesa categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String getTipo() {
        return "Despesa";
    }

    @Override
    public String toString() {
        return "\nDespesa:\nCategoria: " + getCategoria() + "\nDescrição: " + getDescricao() + 
        "\nValor: R$" + (getValor()*-1) + "\nData: " + getData();
    }
}
