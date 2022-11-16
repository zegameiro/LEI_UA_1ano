package Aula2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um determinado tempo em segundos - ");
        int time = sc.nextInt();
        int hours = time / 3600;
        int rest = time % 3600;
        int minutes = rest / 60;
        int seconds = rest %60;
        System.out.print("O tempo em horas:minutos:segundos é " + hours + " h "+ minutes + " m " + seconds + " s.");
        sc.close();
        
    }
    
}
