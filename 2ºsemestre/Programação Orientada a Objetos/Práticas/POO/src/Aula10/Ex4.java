package Aula10;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(new FileReader("words.txt"));
        ArrayList<String> longwords = new ArrayList<>();
        ArrayList<String> wordswiths = new ArrayList<>();

        System.out.println("b)---------------------------------------------");

        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 2) {
                longwords.add(word);
            }
        }
        System.out.println("Palavras com mais do que 2 caracteres: " + longwords);

        System.out.println("c)---------------------------------------------");

        

        for(String word : longwords) {
			if(word.toLowerCase().endsWith("s")) {
				wordswiths.add(word);
			}
		}
        System.out.println("Palavras que acabam com o caracter 's': " + wordswiths);

        System.out.println("d)---------------------------------------------");

        for (int i = 0; i < longwords.size(); i++) {
            String w = longwords.get(i);
            for (char j : w.toCharArray()){
                if(!Character.isLetter(j)) {
                    longwords.remove(w);
                }
            }
        }

        System.out.println("Palavras que contém apenas letras: " + longwords);
        input.close();
    }
}
