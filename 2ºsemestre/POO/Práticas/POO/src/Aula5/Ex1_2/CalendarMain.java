package Aula5.Ex1_2;

import java.util.Scanner;

public class CalendarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, weekday, month, answer;
        Calendar calendar1 = null;
        do{
            System.out.println("Operações do calendário: ");
            System.out.println("1 - Criar um novo calendário");
            System.out.println("2 - Imprimir calendário do mês");
            System.out.println("3 - Imprimir calendário do ano");
            System.out.println("0 - Sair");
            answer = sc.nextInt();
            if (answer == 1) {
                do {
                    System.out.println("Insira um ano");
                    year = sc.nextInt();
                } while(year < 0);
                do {
                    System.out.println("Insira o primeiro dia do ano (1 = Domingo, 2 = Segunda, 3 = Terça, 4 = Quarta, Quinta = 5, Sexta = 6, Sábado = 7)");
                    weekday = sc.nextInt();
                } while(weekday <= 0 || weekday > 7);
                calendar1 = new Calendar(year, weekday);
                System.out.println("Calendário criado com sucesso!\n------------------------------------------");
            }
            if(answer == 2) {
                do {
                    System.out.println(("Insira um mês "));
                    month = sc.nextInt();
                } while(month <= 0 || month > 12);
                if (calendar1 == null) {
                    System.out.println("Não tem nenhum calendário criado!\n-------------------------------------------------");
                } else {
                    calendar1.printMonth(month);
                }
            }
            if (answer == 3) {
                if (calendar1 == null) {
                    System.out.println("Não tem nenhum caléndário criado!\n");;
                }else {
                    calendar1.printCalendario();
                }
            }
        } while(answer != 0);
        sc.close();
    }
}
