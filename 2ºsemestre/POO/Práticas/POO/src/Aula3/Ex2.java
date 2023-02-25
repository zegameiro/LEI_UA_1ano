package Aula3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número natural positivo");
        int n = sc.nextInt();
        while ( n < 0) {
            System.out.println("Insira um número natural válido positivo");
            n = sc.nextInt();
        }
        System.out.println("Contagem decrescente");
        for (int i = n; i >= 0 ; i--){
            System.out.println(i);
        }
        sc.close();
    }
}
