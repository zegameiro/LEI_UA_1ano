package ExamePratico;

import java.util.LinkedList;
import java.util.List;

public class Cabine {
	private int numero,capacidade;
	private List<String>ocupantes=new LinkedList<>();
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public List<String> getOcupantes() {
		return ocupantes;
	}
	public void setOcupantes(List<String> ocupantes) {
		this.ocupantes = ocupantes;
	}
	public Cabine(int numero, int capacidade, List<String> ocupantes) {
		super();
		this.numero = numero;
		this.capacidade = capacidade;
		this.ocupantes = ocupantes;
	}
	@Override
	public String toString() {
		return "Cabine [numero=" + numero + ", capacidade=" + capacidade + ", ocupantes=" + ocupantes + "]";
	}
	
}
