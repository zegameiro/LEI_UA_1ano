package Aula3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double total = 0.0;
        System.out.println("Insira o valor do montante investido inicial(este terá de ser múltiplo de 1000) ");
        double mont = sc.nextDouble();
        while ( mont%1000 != 0 ) {
            System.out.println("Insira um valor do montante investido válido!");
            mont = sc.nextDouble();
        }
        System.out.println("Insira o valor da taxa mensal que deverá de ser entre 0% e 5%");
        double taxa = sc.nextDouble();
        while ( taxa < 0.0 || taxa > 5.0 ) {
            System.out.println("Insira um valor válido para a taxa mensal ");
            taxa = sc.nextDouble();
        }
        double taxaperc = taxa / 100;
        for ( int i = 1; i <= 12 ; i++) {
            total = mont + (mont*taxaperc);
            mont = total;
            System.out.printf(i + " º mês: %.2f euros \n", mont);

        }
        sc.close();
    }
    
}
