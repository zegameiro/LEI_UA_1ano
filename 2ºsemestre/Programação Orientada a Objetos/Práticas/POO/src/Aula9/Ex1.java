package Aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Aula7.Ex2.DateND;
import Aula5.Ex1_2.Date1;
import Aula6.Ex1.Pessoa;

public class Ex1 {
    public static void main(String[] args) {

        ArrayList<Integer> c1 = new ArrayList<>();

        for (int i = 10; i <= 100; i+=10) 
            c1.add(i);

        System.out.println("Size: " + c1.size());

        for (int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento: " + c1.get(i));

        System.out.println("-----------------------------------------------------");

        ArrayList<String> c2 = new ArrayList<>();

        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");

        System.out.println(c2);

        Collections.sort(c2);

        System.out.println(c2);

        c2.remove("Frio"); 
        c2.remove(0);

        System.out.println(c2);

        c2.add(1, "Vento");

		System.out.println(c2);

		c2.set(2, "Neve");
        c2.add("Frio");
        c2.add("Calor");

		System.out.println(c2);
		System.out.println(c2.indexOf("Neve"));
        System.out.println(c2.lastIndexOf("Neve"));

        System.out.println(c2.get(2).contains("Ne"));

        c2.set(4, "Quente");

        System.out.println(c2);

        System.out.println("-----------------------------------------------------");

        Set<Pessoa> c3 = new HashSet<>();

        Pessoa p1 = new Pessoa("Rafaela", 281934,new Date1(2003, 9, 4));
        Pessoa p2 = new Pessoa("Mariana", 7483912,new Date1(1789, 5, 23));
        Pessoa p3 = new Pessoa("Luís", 627392,new Date1(1991, 11, 30));
        Pessoa p4 = new Pessoa("Bruna", 231457,new Date1(1994, 3, 12));
        Pessoa p5 = new Pessoa("Zé", 5673254,new Date1(2004, 9, 10));
        
        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);
        c3.add(p3); // testar se é possível ter referências repetidas num hashset

        Iterator<Pessoa> i=c3.iterator();

        while(i.hasNext()) {  
            System.out.println(i.next());  
        }  

        System.out.println("-----------------------------------------------------");

        Set<DateND> c4 = new TreeSet<>();

        c4.add(new DateND(12,5,1789));
        c4.add(new DateND(19,12,2022));
        c4.add(new DateND(10,1,1997));
        c4.add(new DateND(11,9,2001));
        c4.add(new DateND(6,8,1999));

        Iterator<DateND> i1 = c4.iterator();

        while(i1.hasNext()) {
            System.out.println(i1.next());
        }
    }

}

