package Aula4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma string");
        String str = sc.nextLine();
        while(str.length() == 0) {
            System.out.println("Insira uma string válida!");
            str = sc.nextLine();
        }
        System.out.println("A string em minúsculas é - " + str.toLowerCase());
        System.out.println("O último caracter é - " + str.charAt(str.length()-1));
        if (str.length() == 2) {
            System.out.println("Os 2 primeiros caracteres desta string é - " + str.charAt(0) + " e " + str.charAt(1));
        }
        else if (str.length() == 1) {
            System.out.println("O único caracter desta string é - " + str.charAt(0));
        }
        else {
            System.out.println("O 3 primeiros caracteres desta string são - " + str.charAt(0) + " , " + str.charAt(1) + " e " + str.charAt(2));
        }
        String str1 = str.replaceAll(" ", "");
        System.out.println("A string introduzida sem espaços - " + str1);
        sc.close();
        int soma = 0;
        Character a;
        for (int i = 0; i < str1.length(); i++){
            a = str1.charAt(i);
            if (a.equals('a') || a.equals('e') || a.equals('i') || a.equals('o') || a.equals('u') || a.equals('A') || a.equals('E') || a.equals('I') || a.equals('O') || a.equals('U')) {
                soma++;
            } else {
                soma += 0;  
            }
        }
        System.out.println("Na string submetida estão presentes " + soma + " vogais");
        System.out.print("A string em maísculas é " + str.toUpperCase());
    }
}
