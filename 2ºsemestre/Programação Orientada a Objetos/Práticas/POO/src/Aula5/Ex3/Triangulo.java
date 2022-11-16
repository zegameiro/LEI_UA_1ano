package Aula5.Ex3;

import java.lang.Math;

public class Triangulo {

    private double lado1, lado2, lado3, per, area;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3; 
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
        lado1 = l1;
    }

    public void setLado2(double l2) {
        lado2 = l2;
    }

    public void setLado3(double l3) {
        lado3 = l3;
    }

    public double getPerimetro(double l1, double l2, double l3) {
        per = l1 + l2 + l3;
        return per;
    }

    public double getArea(double l1, double l2, double l3) {
        area = Math.sqrt((per/2)*((per/2)-l1)*((per/2)-l2)*((per/2)-l3));
        return area;
    }

    public String typeTriangulo() {
        if(lado1 == lado2 && lado1 == lado3) {
            return "Este triângulo é quadrilátero";
        } else if (lado1 == lado2  && lado1 != lado3 || lado1 == lado3 && lado3 != lado2 || lado2 == lado3 && lado2 != lado1) {
            return "Este triângulo é isósceles";
        } else {
            return "Este triângulo é escaleno";
        }
    }


    public String toString() {
        return "\n         Lados do triângulo - "+ lado1 + ", " + lado2 + ", " + lado3 + 
               "\n         Perímetro do triângulo - " + getPerimetro(lado1, lado2, lado3) + 
               "\n         Área do triângulo - " + getArea(lado1, lado2, lado3) + 
               "\n         " + typeTriangulo() + 
               "\n";
    }

}
