/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correção_Model;

/**
 *
 * @author Almir
 */
public class DiariaBicicleta {
    
    private int quantidadeHoras;
    private Convenio convenio;
    
    /**
     * Construtor padrão para criar uma instância de {@code DiariaBicicleta}.
     * 
     * @param quantidadeHoras A quantidade de horas de aluguel da bicicleta.
     *                        Deve ser maior que zero, e para estudantes deve ser no mínimo duas horas.
     * @param convenio O convênio aplicável ao aluguel. Não pode ser {@code null}.
     * @throws IllegalArgumentException Se a quantidade de horas for inválida ou se o convênio for {@code null}.
     */
    public DiariaBicicleta(int quantidadeHoras, Convenio convenio) {
        
        setQuantidadeHoras(quantidadeHoras);
        setConvenio(convenio);
    }

    /**
     * Define a quantidade de horas de aluguel.
     * 
     * <p>Para o convênio de estudante, a quantidade mínima de horas é 2.
     * 
     * @param quantidadeHoras A quantidade de horas de aluguel. Deve ser maior que zero.
     * @throws IllegalArgumentException Se a quantidade de horas for menor que 2 para estudantes ou se for menor ou igual a zero.
     */
    public void setQuantidadeHoras(int quantidadeHoras) {
        
        if (Convenio.ESTUDANTE.equals(convenio) && quantidadeHoras < 2) {
            throw new IllegalArgumentException("Para estudante o mínimo é duas horas!");
        }
        if (quantidadeHoras <= 0) {
            throw new IllegalArgumentException("Informe uma quantidade de horas válida");
        }
        this.quantidadeHoras = quantidadeHoras;
    }

    /**
     * Retorna a quantidade de horas de aluguel.
     * 
     * @return A quantidade de horas de aluguel.
     */
    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    /**
     * Define o convênio aplicável ao aluguel.
     * 
     * @param convenio O convênio a ser aplicado. Não pode ser {@code null}.
     * @throws IllegalArgumentException Se o convênio for {@code null}.
     */
    public void setConvenio(Convenio convenio) {
        if (convenio == null) {
            throw new IllegalArgumentException("Convênio não pode ser vazio");
        }
        this.convenio = convenio;
    }

    /**
     * Retorna o convênio aplicado ao aluguel.
     * 
     * @return O convênio aplicado.
     */
    public Convenio getConvenio() {
        return convenio;
    }
    
    /**
     * Calcula o valor total a ser pago pelo aluguel da bicicleta, levando em consideração a quantidade de horas,
     * o convênio aplicado e os descontos correspondentes.
     * 
     * <p>Os descontos podem ser:
     * <ul>
     *   <li>5% de desconto para os convênios CDL ou NSC</li>
     *   <li>50% de desconto no valor da hora para estudantes</li>
     *   <li>Descontos progressivos de 20% e 30% para aluguéis de 5 ou mais horas e 10 ou mais horas, respectivamente</li>
     * </ul>
     * 
     * @return O valor total a ser pago pelo aluguel da bicicleta.
     */
    public float valorTotalPagar() {
        
        float valorHora = 10.00f;
        float percentualDescontoHoras = 0.00f;
        float percentualDescontoConvenio = 0.00f;
        
        switch (convenio) {
            case CDL:
            case NSC:
                // Desconto para convênios CDL ou NSC
                percentualDescontoConvenio = 0.05f;
                break;
            case ESTUDANTE:
                // Desconto para estudantes
                valorHora = valorHora / 2;
                break;
        }
        
        if (quantidadeHoras >= 10) {
            percentualDescontoHoras = 0.30f;
            
        } else if (quantidadeHoras >= 5) {
            percentualDescontoHoras = 0.20f;
        }
        
        float valorTotal = valorHora * quantidadeHoras;
        
        if (percentualDescontoConvenio > 0.0f) {
            valorTotal = valorTotal - (valorTotal * percentualDescontoConvenio);
        }
        
        if (percentualDescontoHoras > 0.0f) {
            valorTotal = valorTotal - (valorTotal * percentualDescontoHoras);
        }
        
        return valorTotal;
    }
    
}
