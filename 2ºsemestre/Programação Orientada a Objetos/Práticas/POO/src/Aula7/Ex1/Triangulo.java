package Aula7.Ex1;

import java.lang.Math;

public class Triangulo extends Forma{
    private double lado1, lado2, lado3, per, area;

    public Triangulo(double lado1, double lado2, double lado3, String cor) {
        super(cor);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);

    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado1(double l1) {
        this.lado1 = l1;
    }
    public void setLado2(double l2) {
        this.lado2 = l2;
    }
    public void setLado3(double l3) {
        this.lado3 = l3;
    }
    public double getPerimetro() {
        per = lado1 + lado2 + lado3;
        return per;
    }
    public double getArea() {
        area = Math.sqrt((per/2)*((per/2)-lado1)*((per/2)-lado2)*((per/2)-lado3));
        return area;
    }
    // public boolean equals(Triangulo t) {
    //     if(getArea() == getArea(t.getLado1(),t.getLado2(),t.getLado3())){
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
    public String toString() {
        return "Perímetro do triângulo: " + getPerimetro() + "\nÁrea do triângulo: " + getArea() + "\n";
    }

}
