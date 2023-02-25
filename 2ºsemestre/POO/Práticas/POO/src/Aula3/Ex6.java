package Aula3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int ano, mes;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Insira um ano ");
            ano = sc.nextInt();
        } while (ano < 0);
        do {
            System.out.println("Insira um mes");
            mes = sc.nextInt();
        } while (mes < 1 && mes > 12);

        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
			System.out.println("Este mês tem 30 dias");
			break;
		    case 2:
			    if (ano%4==0 && ano%100 != 0 ) {
				    System.out.println("Este mês tem 29 dias");
			    } else if (ano%400 == 0){
				    System.out.println("Este mês tem 29 dias");
			    } else {
                    System.out.println("Este mês tem 28 dias");
                }
			    break;
		    default:
			    System.out.println("Este mês tem 31 dias");
		}
        sc.close();

    }
    
}
