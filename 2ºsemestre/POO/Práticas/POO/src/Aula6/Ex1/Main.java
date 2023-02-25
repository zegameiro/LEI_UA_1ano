package Aula6.Ex1;

import Aula5.Ex1_2.Date1;

public class Main {
    public static void main(String[] args) {
		    Date1 d = new Date1(1988,10,13);
        Pessoa p = new Pessoa("Ana Santos", 98012244, d);
        System.out.println(p);
        
        Aluno al = new Aluno ("Andreia Melo", 9855678, new Date1(18, 7, 1990));
        Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new Date1(11, 5, 1985), 900);
        bls.setBolsa(1050);
            
        System.out.println("Aluno: " + al.getNome());
        System.out.println(al);
            
        System.out.println("Bolseiro: " + bls.getNome() + ", NMec: " + bls.getNMec() + ", Bolsa: " + bls.getBolsa());
        System.out.println(bls);
	}
}
