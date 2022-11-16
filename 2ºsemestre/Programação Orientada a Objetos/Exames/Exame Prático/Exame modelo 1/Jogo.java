package ExamePratico;

import java.util.Arrays;

public class Jogo {
	private Equipa[] equipas=new Equipa[2];
	private Bola bola;
	private int tempoTotal;
	private int tempoPercorrido;
	public Jogo(Equipa e1,Equipa e2, Bola bola, int tempoTotal) {
		this.equipas[0] = e1;
		this.equipas[1] = e2;
		this.bola = bola;
		this.tempoTotal = tempoTotal;
	
	}
	public Equipa[] getEquipas() {
		return equipas;
	}
	public void setEquipas(Equipa[] equipas) {
		this.equipas = equipas;
	}
	public Bola getBola() {
		return bola;
	}
	public void setBola(Bola bola) {
		this.bola = bola;
	}
	public int getTempototal() {
		return tempoTotal;
	}
	public void setTempototal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	public int getTempoPercorrido() {
		return tempoPercorrido;
	}
	public void setTempoPercorrido(int tempoPercorrido) {
		this.tempoPercorrido = tempoPercorrido;
	}
	@Override
	public String toString() {
		return "Jogo entre " + equipas[0].getNome() + " e " + equipas[1].getNome() + "\n";
		
}
	
}
