package Aula6.Ex1;

import Aula5.Ex1_2.Date1;

public class Aluno extends Pessoa {
    private final int NMec;
	private static int contador = 100;

	public Aluno(String nome, int cc, Date1 dataNasc) { 
		super(nome, cc, dataNasc);
		this.NMec= contador++;
	}
	
	public int getNMec() {
		return NMec;
	}
    
	@Override
	public String toString() {
		return this.getNome() + ", NMec: " + this.getNMec();
	}

}


