package Aula5.Ex3;

public class Main {
    public static void main(String[] args) {

        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(9);
        Circulo c3 = new Circulo(5);

        System.out.println("Círculos:\n ");
        System.out.println("    Círculo c1: " + c1);
        System.out.println("    Círculo c2: " + c2);
        System.out.println("    Círculo c3: " + c3);
        System.out.println("---------------------------------\n");

        Retangulo r1 = new Retangulo(3, 4);
        Retangulo r2 = new Retangulo(6, 2);
        Retangulo r3 = new Retangulo(2, 10);

        System.out.println("Retângulos:\n ");
        System.out.println("    Retângulo r1: " + r1);
        System.out.println("    Retângulo r2: " + r2);
        System.out.println("    Retângulo r3: " + r3);
        System.out.println("---------------------------------");

        Triangulo t1 = new Triangulo(3, 3, 2);
        Triangulo t2 = new Triangulo(2, 6, 7);
        Triangulo t3 = new Triangulo(5, 5, 5);

        System.out.println("Triângulos:\n ");
        System.out.println("    Triângulo t1: " + t1);
        System.out.println("    Triângulo t2: " + t2);
        System.out.println("    Triângulo t3: " + t3);
        System.out.println("---------------------------------\n");
    }
}
