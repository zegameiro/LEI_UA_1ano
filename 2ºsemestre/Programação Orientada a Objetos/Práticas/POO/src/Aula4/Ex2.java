package Aula4;

import java.util.Scanner;

public class Ex2 {
    
    public static int CountDigits(String s) {
        int soma = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (Character.isDigit(a)) {
                soma += 1;
            }
        }
        return soma;
    }

    public static int CountSpaces(String s) {
        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            char b = s.charAt(j);
            if (Character.isWhitespace(b)) {
                count += 1;
            }
        }
        return count;
    }

    public static boolean Lower(String s) {
        boolean validation = true;
        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);
            if (Character.isUpperCase(c)) {
                validation = false;
            }
        }
        return validation;
    }

    public static String ReduceSpaces(String s) {
		String wspaces = s.replaceAll("\\s{2,}", " ");
		return wspaces;
	}

    public static boolean isPalindrome(String s) {
        boolean val = true;
        for (int y = 0; y < s.length(); y++) {
            char d = s.charAt(y);
            char ld = s.charAt(y);
            if (d != ld) {
                val = false;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.println("Insira uma string ");
            s = sc.nextLine();
        } while (s.length() == 0);
        sc.close();

        System.out.println("A string introduzida apresenta " + CountDigits(s) + " digítos");
        System.out.println("A string introduzida apresenta " + CountSpaces(s) + " espaços");

        if (Lower(s)) {
            System.out.println("A string introduzida apresenta só letras minúsculas");
        } else {
            System.out.println("A string introduzida não apresenta só letras minúsculas");
        }

        System.out.println("Redução dos espaços da string : " + ReduceSpaces(s));

        if (isPalindrome(s)) {
            System.out.println("A string introduzida é um palíndromo");
        } else {
            System.out.println("A string introduzida não é um palíndromo");
        }

    }
    
}
