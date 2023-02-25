package Aula4;

import java.util.Scanner;

public class Ex4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int valDates(String prompt, int min, int max) {	
		int num;
		do {
			System.out.println(prompt);
			num = sc.nextInt();
		}while(num > max || num < min);
		
		return num;	
	}
	
	public static int getDias(int mes, int ano) {					
		int dias;
		int[] lista = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		
		
		if(mes==2) {													
			if ((ano%4==0 && ano%100!=0) || ano%400==0) {
				dias = 29;
			} else {
				dias = 28;
			}	
		} else {					
			dias = lista[mes-1];
		}
		
		return dias;
	}
	
	public static String getName(int mes) {		
		
		String[] lista = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	
			String name = lista[mes-1];
		
		return name;
	}
	
	public static void printCalendar(int mes, int ano, int dia1) {
		
		int dias = getDias(mes, ano);
		String nomeMes = getName(mes);
		
		System.out.printf("%20s %-15s\n", nomeMes, ano);
		
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab");
		
		for(int l=0; l<6; l++) {		
			for(int c=1; c<8; c++) {	
				
				if( (l==0 && c<dia1) || ((l*7 + (c-dia1 + 1)) > dias) ) {	
					System.out.printf("%5s", " ");							
				}
				else {
					System.out.printf("%5d", (l*7 + (c-dia1 + 1)));		
				}
			}
			System.out.println();		
		}
		
	}
	
	public static void main(String[] args) {		
		int mes = valDates("Insira um mês", 1, 12);
		int ano = valDates("Insira um ano", 0, 9999);
		int diaInicial = valDates("Qual o primeiro dia do mês? (1 = Dom, 2 = Seg, 3 = Ter, 4 = Qua, 5 = Qui, 6 = Sex, 7 = Sab)", 1, 7);
		
		printCalendar(mes, ano, diaInicial);
		
		sc.close();
	}

}