package Aula10;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;

public class Ex2 {
    public static void main(String[] ars) {

        Scanner sc = new Scanner(System.in);
        int answer;
        String key,value;

        Map<String,HashSet<String>> map = new HashMap<>();

        do {

            System.out.println("Operações:");
            System.out.println("    1 - Imprimir o mapa");
            System.out.println("    2 - Adicionar um elemento ao mapa");
            System.out.println("    3 - Adicionar um Value a um elemento");
            System.out.println("    4 - Remover um  elemento do mapa");
            System.out.println("    5 - Imprimir um Value aleatório de um elemento");
            System.out.println("    0 - Sair");

            answer = sc.nextInt();

            System.out.println("--------------------------------");

            if (answer == 1) {

                if (map.size() == 0){

                    System.out.println("Não existem elementos no mapa!");

                } else {

                    for (String i : map.keySet()) {
                        System.out.println(i + " - " + map.get(i));
                    }
                }

                System.out.println("--------------------------------");

            }

            if (answer == 2) {
                sc.nextLine();
                do {
                    System.out.println("Insira uma Key");
                    key = sc.nextLine();
                } while(key.length() == 0);

                do {
                    System.out.println("Insira um Value");
                    value = sc.nextLine();
                } while(key.length() == 0);

                map.put(key, new HashSet<String>());
                map.get(key).add(value);

                System.out.println("Elemento adicionado com sucesso!");
                System.out.println("--------------------------------");

            }

            if (answer == 3) {
                sc.nextLine();
                do {
                    System.out.println("Escolha qual o elemento que pretende através da sua Key");
                    key = sc.nextLine();
                } while(!map.containsKey(key));

                do {
                    System.out.println("Insira um novo Value");
                    value = sc.nextLine();
                } while(value.length() == 0);

                map.get(key).add(value);

                System.out.println("Value adicionado com sucesso!");
                System.out.println("--------------------------------");
                
            }

            if(answer == 4) {
                sc.nextLine();
                do {
                    System.out.println("Insira a Key do elemento que quer retirar");
                    key = sc.nextLine();
                } while(!map.containsKey(key));

                map.remove(key);

                System.out.println("Elemento eliminado com sucesso!");
                System.out.println("-------------------------------");
            }

            if(answer == 5) {
                sc.nextLine();
                do {
                    System.out.println("Insira uma key que esteja presente no mapa");
                    key = sc.nextLine();
                } while(!map.containsKey(key));
                System.out.println(getRandom(map.get(key)));
                System.out.println("-------------------------------");
            }

        } while(answer != 0 || answer > 5);

         sc.close();

    }

    public static String getRandom(HashSet<String> set) {
        int item = new Random().nextInt(set.size());
        int j = 0;
        for(String str : set) {
            if(j == item) {
                return str;
            }
            j++;
        }
        return "Sem values possíveis";

    }
}