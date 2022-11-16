package Aula12;

import java.util.HashSet;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Set;
import java.io.IOException;

public class Ex1 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(new FileReader("ex1.txt"));
        Set<String> set = new HashSet<>();
        int value = 0;

        while(input.hasNext()) {
            String word = input.next();
            value++;
            set.add(word);
        }

        System.out.println("Número total de palavras: " + value);
        System.out.println("Número de diferentes palavras: " + set.size());
    }
    
}
