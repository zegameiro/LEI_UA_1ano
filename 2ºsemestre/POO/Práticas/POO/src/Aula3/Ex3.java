package Aula3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        int value, value1;
        int div = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Número: ");
            value = sc.nextInt();
            if ( value < 0) {
                System.out.println("Insira um número válido! (Inteiro positivo)");
            }
        } while ( value < 0);

        value1 = value;

        while ( value > 0 ) {
            if ( value1%value == 0){
                div++;
            } 
            value--;
        }
        if ( div == 2 ) {
            System.out.println(value1 + " é primo");
        } else {
            System.out.println(value1 + " não é primo");
        }
        sc.close();
    } 
    
}
