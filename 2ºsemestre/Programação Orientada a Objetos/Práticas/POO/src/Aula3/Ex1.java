package Aula3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua nota da componente Teórico Prática de POO (arredondado às décimas)");
        Double notaTP = sc.nextDouble();
        while ( notaTP < 0 || notaTP > 20 ) {
            System.out.println("Insira uma nota válida para a componente Teórico Prática");
            notaTP = sc.nextDouble();
        }
        System.out.println("Insira a sua nota da componente Prática de POO (arredondado às décimas)");
        Double notaP = sc.nextDouble();
        while ( notaP < 0.0 || notaP > 20.0) {
            System.out.println("Insira uma nota válida para a componente Prática");
            notaP = sc.nextDouble();
        }
        if (notaP < 7.0 || notaTP < 7.0) {
            System.out.print("Reprovado por nota miníma!");
        } else {
            Double notaF = 0.4 * notaTP + 0.6 * notaP;
            String nota = String.format("A sua nota final é %.0f", notaF);
            System.out.println(nota);
        }
        sc.close();
    }
}
