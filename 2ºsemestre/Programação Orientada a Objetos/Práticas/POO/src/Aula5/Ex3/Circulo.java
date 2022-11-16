package Aula5.Ex3;

public class Circulo {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio; 
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(int r) {
        raio = r;
    }

    public double getPerimetro(double r) {
        return 2 * Math.PI * r;
    }

    public double getArea(double r) {
        return Math.PI * (Math.pow(r,2));
    }

    public String toString() {
        return "\n         Raio: " + getRaio() +
               "\n         Perímetro do círculo:  " + getPerimetro(raio) + 
               "\n         Área do círculo: " + getArea(raio) +
               "\n";
    }
}   
