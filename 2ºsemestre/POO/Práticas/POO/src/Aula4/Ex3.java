package Aula4;

import java.util.Scanner;

public class Ex3 {

    public static String Acronym(String s) {
        String acro;
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");

        for(String i : words){
            if (i.length() > 3) {
                sb.append(Character.toUpperCase(i.charAt(0)));
            }
        }

        acro = sb.toString();
        return acro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.println("Insira uma frase");
            str = sc.nextLine();
        } while(str.length() < 0);
        System.out.println("O acrónimo da string introduzida é " + Acronym(str));
        sc.close();
    }
    
}
