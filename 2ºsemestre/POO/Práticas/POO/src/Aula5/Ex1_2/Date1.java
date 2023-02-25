package Aula5.Ex1_2;

public class Date1 {

    int month,year,day ;

    public Date1(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int y) {
        year = y;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setDay(int d) {
        day = d;
    }

    public String toString() {
        return year +" / " + month + " / " + day;
    }

    public static Boolean ValidMonth(int month) {
        if(month <= 0 || month > 12) {
            return true;
        } else {
            return false;
        }
    }

    public static int MonthDays(int month, int year) {
        int days = 0;
        switch (month) {
            case 4,6,9,11:
            days = 30;
            break;
            case 1,3,5,7,8,10,12:
            days = 31;
            break;
            case 2:
                if (LeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        return days;
    }

    public static Boolean LeapYear(int year) {
        Boolean retVal = true;
        if (year%4==0 && year%100 != 0 || year%400 == 0) {
            retVal = true;
        } else {
            retVal = false;
        }
        return retVal;
    }

    public static Boolean validDate(int days, int month, int year) {
        Boolean validate = true;
        if (days < 0 || days > 31 || month < 1 || month > 12 || year < 0) {
            validate = false;
        }
        return validate;
    }

    public void Increment(int incr) {
        for (int i = 1; i <= incr; i++){
            if(day + 1 > MonthDays(month, year) && month == 12) {
                year += 1;
                month = 1;
                day = 1;
                i++;
            } else if (month != 12 && day + 1 > MonthDays(month, year)) {
                month += 1;
                day = 1;
                i++;
            } else {
                day += 1;
            }
        }
    }

    public void Decrement(int decr) {
        for (int j = 1; j <= decr; j++) {
            if (day - 1 <= 0 && month == 1) {
                year -= 1;
                month = 31;
                day = MonthDays(month, year);
                j++;
            } else if (day - 1 <= 0 && month != 1) {
                month -= 1;
                day = MonthDays(month - 1, year);
                j++;

            } else {
                day--;
            }
        }
    }
}
