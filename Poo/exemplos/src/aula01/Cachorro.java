package Poo.exemplos.src.aula01;

public class Cachorro {
    
    String nome;
    String raca;
    double peso;
    String cor;
    
    public void latir() {
        System.out.println(nome + " está latindo!");
    }
    
    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }
    
    public void pegarObjeto(String objeto) {
        System.out.println(nome + " está buscando o(a) " + objeto);
    }

}