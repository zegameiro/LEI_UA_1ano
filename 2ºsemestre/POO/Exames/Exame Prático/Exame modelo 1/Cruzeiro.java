package ExamePratico;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cruzeiro {
	private String nome;
	private String [] cidades;
	private String datacomeco;
	private Set<Cabine>listacabines=new TreeSet<>();
	private int duracao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getCidades() {
		return cidades;
	}
	public void setCidades(String[] cidades) {
		this.cidades = cidades;
	}
	public String getDatacomeco() {
		return datacomeco;
	}
	public void setDatacomeco(String datacomeco) {
		this.datacomeco = datacomeco;
	}
	public Set<Cabine> getListacabines() {
		return listacabines;
	}
	public void setListacabines(Set<Cabine> listacabines) {
		this.listacabines = listacabines;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Cruzeiro(String nome, String[] cidades, String datacomeco, Set<Cabine> listacabines, int duracao) {
		super();
		this.nome = nome;
		this.cidades = cidades;
		this.datacomeco = datacomeco;
		this.listacabines = listacabines;
		this.duracao = duracao;
	}
	
	
}
