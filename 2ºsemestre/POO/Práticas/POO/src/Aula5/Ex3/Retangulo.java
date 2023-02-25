package Aula5.Ex3;

public class Retangulo {
    private double comprimento, altura;
    
    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setComprimento(double c) {
        comprimento = c;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public double getPerimetro(double a, double c) {
        return 2*a + 2*c;
    }

    public Double getArea(Double com, Double alt) {
        return com*alt;
    }
    
    public String toString() {
        return "\n         Comprimento - " + comprimento +
               "\n         Altura - " + altura + 
               "\n         Perímetro do retângulo - " + getPerimetro(comprimento,altura) + 
               "\n         Área do retângulo - " + getArea(comprimento, altura) + 
               "\n";
    }
}
