package Aula11;

import java.io.*;
import java.util.*;

public class Ex2 {

    public static void main(String[] args) throws IOException {

        Map<String,String> siglasCompanhias = new TreeMap<String,String>();
        List<Voo> listaVoos = new LinkedList<Voo>();

        Scanner scCompanhias = new Scanner(new FileReader("companhias.txt"));
        Scanner scVoos = new Scanner(new FileReader("voos.txt"));
        
        scCompanhias.nextLine();
        String lines[];

        //Ler o ficheiro companhias.txt e guardá-las no TreeMap siglasCompanhias
        while(scCompanhias.hasNext()) {
            lines = scCompanhias.nextLine().split("[\t]");
            siglasCompanhias.put(lines[0],lines[1]);
        }

        //Passar as siglas das companhias lidas para a classe Voo
        Voo.setSiglasCompanhias(siglasCompanhias);

        scCompanhias.close();

        lines = null;
        scVoos.nextLine();

        //Ler o ficheiro voos.txt e adicionar à listaVoos
        while(scVoos.hasNext()) {
            lines = scVoos.nextLine().split("[\t]");
            if(lines.length == 4) {
                listaVoos.add(new Voo(lines[0], lines[1], lines[2], lines[3]));
            } else {
                listaVoos.add(new Voo(lines[0], lines[1], lines[2]));
            }
        }

        scVoos.close();

        //a) Impressão dos dados de todos os Voos incluindo o atraso e o tempo previsto
        System.out.printf("%-15s %-15s %-20s %-20s %-15s %-15s \n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");

		for (Voo v : listaVoos) {
			System.out.println(v);
		}

        //b) Criação do ficheiro Infopublico.txt e guardá-lo com os voos organizadps
        PrintWriter pw = new PrintWriter(new File("Infopublico.txt"));
        pw.printf("%-15s %-15s %-20s %-20s %-15s %-15s \n", "Hora","Voo","Companhia","Origem","Atraso","Obs");
        for (Voo v : listaVoos) {
            pw.println(v);
        }

        pw.close();
        System.out.println("Ficheiro Infopublico.txt gravado com sucesso!");
        System.out.println("---------------------------------------------------------------------------------------");

        //c) Média dos Atrasos
        Map<String, int[]> atrasos = new HashMap<String,int[]>();

        for(Voo v : listaVoos) {
            if(v.getAtraso() != "") {
                int[] tmp;
                if(atrasos.containsKey(v.getVoo().substring(0,2).trim())) {
                    tmp = atrasos.get(v.getVoo().substring(0,2).trim());
                } else {
                    tmp = new int[2];
                }

                tmp[0]++;
                tmp[1] += Voo.stringTominutes(v.getAtraso());

                atrasos.put(v.getVoo().substring(0,2).trim(), tmp);
            }
        }

        HashMap<String,Integer> atrasosTable = new HashMap<String,Integer>();

        for (String c : atrasos.keySet()) {
            int[] a = atrasos.get(c);
            atrasosTable.put(c,(int) a[1] / a[0]);
        }

        atrasosTable = sortByValue(atrasosTable, 1);

        System.out.printf("%-20s %-15s \n","Companhia","Voos");

        for (String b : atrasosTable.keySet()) {
            System.out.printf("%-20s %-15s \n", siglasCompanhias.get(b),Voo.minutesTostring(atrasosTable.get(b)));
        }

        System.out.println("---------------------------------------------------------------------------------------");

        //d) Total de chegadas de cada cidade origem
        HashMap<String, Integer> cidades = new HashMap<String,Integer>();
        int temp;

        for (Voo v : listaVoos) {
            if(cidades.containsKey(v.getOrigem())) {
                temp = cidades.get(v.getOrigem()) + 1;
            } else {
                temp = 1;
            }
            cidades.put(v.getOrigem(), temp);
            cidades = sortByValue(cidades, -1);
        }

        //Criação do ficheiro cidades.txt com informação sobre o número de chegadas de cada cidade origem
        PrintWriter pw1 = new PrintWriter("cidades.txt");
        pw1.printf("%-20s %-15s \n","Origem","Voos");

        for (String s : cidades.keySet()) {
            pw1.printf("%-20s %-15s \n", s, cidades.get(s));
        }

        System.out.println("Ficheiro cidades.txt criado e gravado com sucesso!");
        pw1.close();

        System.out.println("---------------------------------------------------------------------------------------");

    }

    public static HashMap<String, Integer> sortByValue(HashMap<String,Integer> hm, int o) {

        List<Map.Entry<String,Integer>> lst = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());

        Collections.sort(lst, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
                return (o1.getValue().compareTo(o2.getValue()) * o);
            }
        });

        HashMap<String,Integer> temp = new LinkedHashMap<String,Integer>();

        for(Map.Entry<String,Integer> aa : lst) {
            temp.put(aa.getKey(), aa.getValue());
        }

        return temp;
    }
    
}
