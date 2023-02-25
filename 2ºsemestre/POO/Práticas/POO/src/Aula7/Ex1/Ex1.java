package Aula7.Ex1;


public class Ex1 {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(3, 7, 4, "amarelo");
        Circulo c1 = new Circulo(4, "verde");
        Retangulo r1 = new Retangulo(7, 2, "vermelho");
        System.out.println("----------TRIÂNGULO------------");
        System.out.println(t1);
        System.out.println("----------CÍRCULO-------------");
        System.out.println(c1);
        System.out.println("-----------RETÂNGULO-----------");
        System.out.println(r1);
    }
    
}
