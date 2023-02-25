package Aula10;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex3 {
    public static void main(String[] args) {
		String message = "Hello World";
		char[] a = message.replaceAll("\\s+","").toCharArray();
		Map<Character, TreeSet<Integer>> mapa = new TreeMap<>();
		
		for(int j = 0 ; j<a.length ; j++) {

			Character b = a[j];

			if(mapa.containsKey(b)) {
				mapa.get(b).add(j);
			} else {
				TreeSet<Integer> set = new TreeSet<>();
				set.add(j);
				mapa.put(b, set);
			}
			
		}

		System.out.println(mapa.entrySet());
	}
}
