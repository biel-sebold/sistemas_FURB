/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correção_Model;

/**
 *
 * @author Almir
 */
public enum Convenio {

    /** Representa o convênio CDL. */
    CDL("CDL"),

    /** Representa o convênio NSC. */
    NSC("NSC"),

    /** Representa o convênio para estudantes. */
    ESTUDANTE("Estudante"),

    /** Representa a ausência de convênio. */
    SEM_CONVENIO("Sem convênio");

    private final String denominacao;

    /**
     * Construtor do enum, que associa uma denominação a cada constante.
     * 
     * @param denominacao A denominação textual do convênio.
     */
    private Convenio(String denominacao) {
        this.denominacao = denominacao;
    }

    /**
     * Retorna a denominação do convênio.
     * 
     * @return A denominação textual do convênio.
     */
    public String getDenominacao() {
        return denominacao;
    }

    /**
     * Retorna a representação textual do convênio, que corresponde à sua denominação.
     * 
     * @return A denominação do convênio.
     */
    public String toString() {
        return getDenominacao();
    }
}
      
