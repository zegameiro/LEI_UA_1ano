package Aula7.Ex1;

public class Retangulo extends Forma{

    private double comprimento, altura;
    
    public Retangulo(double comprimento, double altura, String cor) {
        super(cor);
        setComprimento(comprimento);
        setAltura(altura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }


    public void setComprimento(double c) {
        this.comprimento = c;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public double getPerimetro() {
        return 2*altura + 2*comprimento;
    }

    public double getArea() {
        return comprimento*altura;
    }
    
    public String toString() {
        return "Perímetro do retângulo: " + getPerimetro() + "\nÁrea do retângulo: " + getArea();
    }

}
