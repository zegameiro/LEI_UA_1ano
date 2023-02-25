package Aula7.Ex1;

public class Circulo extends Forma {
    
    private double raio;

    public Circulo(double raio, String cor){
        super(cor);
        setRaio(raio); 
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(Double r) {
        this.raio = r;
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getArea() {
        return Math.PI * (Math.pow(raio,2));
    }

    public boolean equals(Circulo c) {
        if(getArea() == c.getArea()) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return "Raio: " + getRaio() + "\nPerímetro do círculo:  " + getPerimetro() + "\nÁrea do círculo: " + getArea() + "\n";
    }
}   
