package Aula6.Ex1;

import Aula5.Ex1_2.Date1;

public class Bolseiro extends Aluno {
	private int bolsa;
	
	//construtores

	public Bolseiro(String nome, int cc, Date1 dataNasc) {
		super(nome, cc, dataNasc);
	}

	public Bolseiro(String nome, int cc, Date1 dataNasc, int bolsa) {
		super(nome, cc, dataNasc);
		this.bolsa = bolsa;
	}

	//getters e setters

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

    @Override
	public String toString() {
		return this.getNome() + ", NMec: " + this.getNMec() + ", Bolsa: " + bolsa;
	}
}
