package POO_P12_108840;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Math;

public class RandomTickets {
    
    private ArrayList<Festival> festivais = new ArrayList<>();
    private Map<Pessoa, ArrayList<String>> map = new HashMap<>();
    private Map<String, Integer> nbilhetes = new HashMap<>();
    private String line[];

    private ArrayList<String> fest = new ArrayList<>(); 

    public RandomTickets() {

        Scanner input = null;

        try {
            input = new Scanner(new FileReader("Lista_festivais.txt"));
        } catch(IOException exc) {
            System.out.println("Ficheiro não encontrado");
        }

		input.nextLine(); //ler a primeira linha

        while (input.hasNext()) {
            line = input.nextLine().split("\t");
            festivais.add(new Festival(line[0], line[1], line[2], line[3], Integer.parseInt((line[4]))));
		}

        for(Festival f : festivais) {
            fest.add(f.getName());
        }
    }

    public Map<Pessoa, ArrayList<String>> getRandomTicket(Pessoa p) {

        ArrayList<String> nf = new ArrayList<>();   //Número de festivais(nf)

        int n = (int) (Math.random()*fest.size());

        if(!map.containsKey(p)) {
            nf.add(fest.get(n));
            map.put(p, nf);
        } else {
            if(map.get(p).size() < 2) {
                nf.add(fest.get(n));
                map.get(p).addAll(nf);
            } 
        }
        return map;
    }

    public void listPeople() {

        for(Pessoa p : map.keySet()) {

            System.out.println(p.getName() + " (cc: " + p.getCc() + ", Data de Nascimento: " + p.getDataNasc() + "):\n");

            for(String s : map.get(p)) {

                if(!nbilhetes.containsKey(s)) {
                    nbilhetes.put(s, 1);
                } else {
                    int n = nbilhetes.get(s);
                    nbilhetes.put(s, n+1);
                }
                System.out.println("  " + s + "\n");
            }
        }
    }

    public void listAvailableTickets() {

        System.out.println("Bilhetes Disponíveis: ");

        for(Festival fe : festivais ) {

            int nB = fe.getNTickets();
            String nome = fe.getName();

            for(String str : nbilhetes.keySet()) {

                if(str == nome) {
                    int a = nbilhetes.get(str);
                    System.out.println(nome + " -> " + (nB - a));
                }
            }
        }
    }
}
