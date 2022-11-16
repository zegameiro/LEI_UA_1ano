package Aula2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva a velocidade do 1º trajeto - ");
        Double v1 = sc.nextDouble();
        System.out.print("Escreva a distância do 1º trajeto - ");
        Double d1 = sc.nextDouble();
        System.out.print("Escreva a velocidade do 2º trajeto - ");
        Double d2 = sc.nextDouble();
        System.out.print("Escreva a distância do 2º trajeto - ");
        Double v2 = sc.nextDouble();
        Double t1 = d1 / v1;
        Double t2 = d2 / v2;
        Double vm = (d1 + d2) / (t1+t2);
        System.out.print("A velocidade média é " + vm);
        sc.close();
    }
}
