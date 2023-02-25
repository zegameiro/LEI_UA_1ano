package Aula6.Ex1;

import Aula5.Ex1_2.Date1;

public class Pessoa {
    
    private String nome;
    private int cc;
    private Date1 dataNasc;

    public Pessoa(String nome, int cc, Date1 dataNasc) {
		this.nome = nome; this.cc = cc; this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public int getCc() {
		return cc;
	}

	public Date1 getDataNasc() {
		return dataNasc;
	}
    @Override
	public String toString() {
		return nome + ", CC: " + cc + ", Data de Nascimento: " + dataNasc.toString();
	}
    
}