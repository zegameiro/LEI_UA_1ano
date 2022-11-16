package Aula10;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] ars) {

        Scanner sc = new Scanner(System.in);
        int answer;
        String key,value;

        Map<String,String> map = new HashMap<>();

        do {
            System.out.println("Operações:");
            System.out.println("    1 - Adicionar um elemento ao mapa");
            System.out.println("    2 - Imprimir o mapa");
            System.out.println("    3 - Alterar um elemento do mapa");
            System.out.println("    4 - Remover um  elemento do mapa");
            System.out.println("    0 - Sair");

            answer = sc.nextInt();
            System.out.println("--------------------------------");

            if (answer == 1) {
                do {
                    System.out.println("Insira uma Key");
                    key = sc.nextLine();
                } while(key.length() == 0);

                do {
                    System.out.println("Insira um Value");
                    value = sc.nextLine();
                } while(key.length() == 0);

                map.put(key, value);
                System.out.println("Elemento adicionado com sucesso!");
                System.out.println("--------------------------------");
            }

            if (answer == 2) {
                if (map.size() == 0){
                    System.out.println("Não existem elementos no mapa!");
                } else {
                    for (String i : map.keySet()) {
                        System.out.println(i + " - " + map.get(i));
                    }
                }
                System.out.println("--------------------------------");
            }

            if (answer == 3) {
                do {
                    System.out.println("Insira qual a key que quer alterar ");
                    key = sc.nextLine();
                } while(!map.containsKey(key));
                do {
                    System.out.println("Insira um novo Value para a Key");
                    value = sc.nextLine();
                } while(value.length() == 0);

                map.replace(key, value);
                System.out.println("Elemento alterado com sucesso!");
                System.out.println("------------------------------");
            }

            if(answer == 4) {
                do {
                    System.out.println("Insira a Key do elemento que quer retirar");
                    key = sc.nextLine();
                } while(!map.containsKey(key));
                map.remove(key);
                System.out.println("Elemento eliminado com sucesso!");
                System.out.println("-------------------------------");
            }        

        } while(answer != 0);
         sc.close();
    }
}
