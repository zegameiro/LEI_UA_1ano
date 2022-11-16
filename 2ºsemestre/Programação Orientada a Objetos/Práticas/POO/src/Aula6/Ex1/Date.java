package Aula6.Ex1;

public class Date {
    public int dia, mes, ano;

    public Date(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setDate(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia() {return dia;}
    
    public int getMes() {return mes;}
    
    public int getAno() {return ano;}

    public static Boolean validMonth(int m){
        boolean valid = false;
        if(m>0 && m<13){
            valid = true;
        }
        return valid;
    }
    public static int monthDays(int m, int a){
        int dias;
        switch (m){
            case 1: 
            case 3:dias = 31; break;
            case 2: 
                if((a%4 == 0) && ((a%100 != 0) || (a%400 == 0))){
                    dias = 29;
                }else{dias = 28;
                }break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias = 31; break;
            default: dias = 30;
        }
        return dias;
    }

    public static Boolean leapYear(int a){
        boolean valid = false;
        if((a%4 == 0) && ((a%100 != 0) || (a%400 == 0))){
            valid = true;
        }
        return valid;
    }
    public static Boolean validDate(int d, int m, int a){
        boolean valid = false;
        if(d>0 && d<=monthDays(m, a)){
            valid =true;
        }
        return valid;
    }
    @Override
    public String toString() {
        if(Boolean.TRUE.equals(validMonth(this.mes)) && Boolean.TRUE.equals(validDate(this.dia, this.mes, this.ano)))
            return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
        else{
            return "Invalid date";
        }
    }
    public void incrementDate(){
        if(this.dia<monthDays(this.mes, this.ano)){
            this.dia++;
        }else{
            this.dia = 1;
            if(this.mes<12){
                this.mes++;
            }else{
                this.mes = 1;
                this.ano++;
            }
        }
        setDate(this.dia, this.mes, this.ano);
        System.out.println(getAno());
    }

    public void decrementDate(){
        if(this.dia>1){
            this.dia--;
        }else{
            this.dia = monthDays(this.mes, this.ano);
            if(this.mes>1){
                this.mes--;
            }else{
                this.mes = 12;
                this.ano--;
            }
        }
        setDate(this.dia, this.mes, this.ano);
    }
}
