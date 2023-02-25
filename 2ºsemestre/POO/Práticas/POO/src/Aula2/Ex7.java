package Aula2;

import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a abcissa de um ponto p1: ");
        Double x1 = sc.nextDouble();
        System.out.println("Insira a ordenada de um ponto p1: ");
        Double y1 = sc.nextDouble();
        System.out.println("Insira a abcissa de um ponto p2: ");
        Double x2 = sc.nextDouble();
        System.out.println("Insira a ordenada de um ponto p2: ");
        Double y2 = sc.nextDouble();
        
        Double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.print("A distância entre os pontos p1 e p2 é " + distance);
        sc.close();

    }
}
