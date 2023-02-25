package ExamePratico;

import java.util.HashSet;
import java.util.Set;

public class Equipa implements Comparable<Equipa>{
	private String nome,nomeResponsavel;
	private int golosMarcados,golosSofridos;
	private Set<Robo>conjunto=new HashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public int getGolosMarcados() {
		for(Robo r: conjunto) {
			golosMarcados+=r.getGolos();
		}
		return golosMarcados;
	}
	public void setGolosMarcados(int golosm) {
		this.golosMarcados = golosm;
	}
	public int getGolosSofridos() {
		return golosSofridos;
	}
	public void setGolosSofridos(int goloss) {
		this.golosSofridos = goloss;
	}
	public Set<Robo> getConjunto() {
		return conjunto;
	}
	public void setConjunto(Set<Robo> conjunto) {
		this.conjunto = conjunto;
	}
	public Equipa(String nome, String nomeResponsavel) {
		super();
		this.nome = nome;
		this.nomeResponsavel = nomeResponsavel;
	}
	public Robo[] getRobos() {
		Robo[] r =new Robo[conjunto.size()]; 
		int x=0;
		for(Robo rb:conjunto) {
			r[x]=rb;
			x++;
		}
		return r;
	}
	@Override
	public String toString() {
		String s = "Equipa " + nome + ", treinada por " + nomeResponsavel + " (" + conjunto.size() + " jogadores)\n";
		s += "   robos= ";
		for(Robo r : conjunto) {
			s += r + " *;* ";
		}
		s += "\n   golosMarcados=" + golosMarcados + "\n";
		return s;
}
	public void add(Robo x) {
		this.conjunto.add(x);
	}
	public void remove(Robo x) {
		this.conjunto.remove(x);
	}
	@Override
	public int compareTo(Equipa o) {
		if(this.nome.equals(o.nome)) {
			return 0;
		}
		return -1;
	}
	
}
