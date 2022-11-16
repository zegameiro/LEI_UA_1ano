package Aula7.Ex1;

public abstract class Forma {   
    public abstract double getArea();
    public abstract double getPerimetro();
    private String cor;

    public Forma(String cor) {
        setCor(cor);
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }
    
}
