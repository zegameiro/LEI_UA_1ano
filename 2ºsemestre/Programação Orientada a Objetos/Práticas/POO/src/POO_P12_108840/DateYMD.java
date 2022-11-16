package POO_P12_108840;

public class DateYMD {
    
    public int day, month, year;
    
    public DateYMD(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getAno() {
        return year;
    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }

    public Boolean validMonth(int m) {
        boolean valid = true;

        if(m <= 0 && m > 12) {
            valid = false;
        }
        return valid;
    }

    public int monthDays(int m, int a) {
        int dias;
        switch (m) {
            case 1: 
            case 3:dias = 31; break;
            case 2: 
                if((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias = 31; break;
            default: dias = 30;
        }
        return dias;
    }

    public  Boolean validDate(int d, int m, int a) {
        boolean valid = false;

        if(d > 0 && d <= monthDays(m, a)){
            valid =true;
        }
        return valid;
    }

    @Override
    public String toString() {
        if(Boolean.TRUE.equals(validMonth(month)) && Boolean.TRUE.equals(validDate(day, month, year))) {
            return String.format("%02d/%02d/%04d",day,month,year);
        } else {
            return "Data inválida";
        }
    } 
}
