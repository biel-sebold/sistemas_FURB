package Poo.exercicios.src.lista04;

public class Retangulo {

    private int altura;
    private int comprimento;

    public Retangulo(){

        this.altura = 0;
        this.comprimento = 0;

    }

    public Retangulo(int altura, int comprimento){

        this.altura = altura;
        this.comprimento = comprimento;

    }

    public void setAltura(int altura){
        this.altura = altura;

        if (altura <= 0) {
            throw new IllegalArgumentException(String.format("Valor incorreto para altura: %d", altura));
            
        }
    }

    public int getAltura(){
        return this.altura;
    }


    public void setComprimento(int comprimento){
        this.comprimento = comprimento;

        if (altura <= 0) {
            throw new IllegalArgumentException(String.format("Valor incorreto para altura: %d", comprimento));
            
        }
    }

    public int getComprimento(){
        return this.comprimento;
    }


    public int calcularPerimetro(){

        int perimetro = (altura + comprimento) * 2;
        return perimetro;

    }

    public int calcularArea(){

        int area = altura * comprimento;
        return area;
    }


}
