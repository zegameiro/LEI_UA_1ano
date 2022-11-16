package Aula2;

import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Double mont, taxa, total = 0.0;
        System.out.println("Qual o valor do montante investido?");
        mont = sc.nextDouble();
        System.out.println("Qual o valor da taxa de juro mensal (em percentagem)?");
        taxa = sc.nextDouble();
        Double taxaperc = taxa / 100;
        for (int i = 0; i < 3; i++) {
            total = mont + (mont*taxaperc);
            mont = total;
        }
        System.out.print(mont);
        sc.close();
    }

}
