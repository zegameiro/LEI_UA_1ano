package Aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap; 

public class Ex1 {
    
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(new FileReader("major.txt"));
        input.useDelimiter("[\\p{Punct}\\s]+");
        ArrayList<String> words = new ArrayList<>();
        HashMap<String,HashMap<String,Integer>> pairs = new HashMap<>();

        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 2) {
                words.add(word);
            }
        }

        for (int i = 0; i < words.size()-1; i++) {
            String currentword = words.get(i);
            String nextword = words.get(i+1);

            if(!pairs.containsKey(currentword)) {
                HashMap<String,Integer> map = new HashMap<>();
                map.put(nextword, 1);
                pairs.put(currentword, map);

            } else {
                if(pairs.get(currentword).containsKey(nextword)) {
                    pairs.get(currentword).replace(nextword, pairs.get(currentword).get(nextword), pairs.get(currentword).get(nextword) + 1);
				} else {
					pairs.get(currentword).put(nextword, 1);
				}
            }
            
        }
        input.close();
        for (int j = 0; j < pairs.size(); j++) {
            System.out.println(pairs.entrySet().toArray()[j].toString());
        }

    }
}
