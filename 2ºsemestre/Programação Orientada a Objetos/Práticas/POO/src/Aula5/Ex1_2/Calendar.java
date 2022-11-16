package Aula5.Ex1_2;

import Aula4.Ex4;

public class Calendar {
    int year, firstday;
    public Calendar(int year, int firstday) {
        this.year = year;
        this.firstday = firstday;
    }
    public int Year() {
        return year;
    }
    public int FirstWeekDayoftheYear(){
        return firstday;
    }
    public int FirstDayoftheMonth(int month){
        int totaldays = 0, firstdaymonth = FirstWeekDayoftheYear(),rest;
        for(int i = 1; i < month; i++) {
            totaldays += Date1.MonthDays(i,Year());
        }
        rest = totaldays%7;
        for(int j = 0; j < rest; j++) {
            firstdaymonth++;
            if (firstdaymonth == 8) {
                firstdaymonth = 1;
            }
        }
        return firstdaymonth;

    }
    public void printMonth(int month) {
        int days = Date1.MonthDays(month,year);;
		String name = Ex4.getName(month);
		
		System.out.printf("%20s %-15s\n", name, year);
		
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab");
		
		for(int l=0; l<6; l++) {		
			for(int c=1; c<8; c++) {	
				if( (l==0 && c < FirstDayoftheMonth(month)) || ((l*7 + (c - FirstDayoftheMonth(month) + 1)) > days) ) {	
					System.out.printf("%5s", " ");							
				}
				else {
					System.out.printf("%5d", (l*7 + (c - FirstDayoftheMonth(month) + 1)));		
				}
			}
			System.out.println();		
		}
    }
    public void printCalendario() {
        for (int a = 1; a <= 12; a++) {
            printMonth(a);
        }
    }
}

