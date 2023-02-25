package Aula5.Ex1_2;

import java.util.Scanner;

public class Datemain {
    public static void main(String[] args) {

        Date1 date1 = null;
        int year = 0, month = 0, day = 0, option;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Date operations:\n 1 - create new date\n 2 - show current date\n 3 - increment date\n 4 - decrement date\n 0 - exit\nEscolha uma opção ");
            option = sc.nextInt();

            if (option == 1) {
                do {
                    System.out.println("Insira um ano ");
                    year = sc.nextInt();
                } while (year < 0);

                do {
                    System.out.println("Insira um mês ");
                    month = sc.nextInt();
                } while(Date1.ValidMonth(month));

                do {
                    System.out.println("Insira um dia ");
                    day = sc.nextInt();
                } while (day <= 0 || day > Date1.MonthDays(month, year));

                date1 = new Date1(year, month, day);

                System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                System.out.println("A data foi criada com sucesso! \n-----------------------------------------");
            }

            if (option == 2) {
                System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                if (date1 == null) {
                    System.out.println("Não existe nenhuma data!");
                } else{
                    System.out.println("Data inserida: " + date1 +" \n-----------------------------------------");
                }
            }

            if (option == 3) {
                if (date1 == null) {
                    System.out.println("Não existe nenhuma data criada!");
                } else {                
                    System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                    System.out.println("Insira um incremento (em dias)");

                    int incr = sc.nextInt();

                    date1.Increment(incr);

                    System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                    System.out.println("A data incrementada é " + date1 + "\n ----------------------------------------");
                }
            }

            if (option == 4) {
                if (date1 == null) {
                    System.out.println("Não existe nenhuma data criada!");
                } else {
                    System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                    System.out.println("Insira um decremento (em dias)");

                    int decr = sc.nextInt();
                    date1.Decrement(decr);

                    System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                    System.out.println("A data incrementada é " + date1 + "\n ----------------------------------------");
                }

            }

        } while(option != 0);
        
        sc.close();
    }
}
