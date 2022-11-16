package Aula2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma temperatura em graus Celsius: ");
        Double tempC = sc.nextDouble();
        Double tempF = 1.8 * tempC + 32;
        System.out.print("A temperatura em Fahrenheit é de " + tempF);
        sc.close();
    }
}
