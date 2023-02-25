package ExamePratico;

public class Robo extends ObjetoMovel{
	private String id;
	private TipoJogador tipo;
	private String posicao;
	private String clube;
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getClube() {
		return clube;
	}
	public void setClube(String clube) {
		this.clube = clube;
	}
	private int golos;
	public Robo(int x, int y, int velocidade, int distancia) {
		super(x, y, velocidade, distancia);
		
		
	}
	public Robo (String id,String clube,String posicao) {
		super(0,0);
		this.id=id;
		this.clube=clube;
		this.posicao=posicao;
	}
	@Override
	public String toString() {
		return "id=" + id + ", tipo=" + posicao;
}
	public Robo(int x, int y,String id, TipoJogador tipo) {
		super(x, y);
		this.id=id;
		this.tipo=tipo;
	}
	public Robo(String id, TipoJogador tipo, int x, int y) {
		super(x,y);
		this.id=id;
		this.tipo=tipo;
	}
	public void marcaGolo() {
		this.golos+=1;
		
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TipoJogador getTipo() {
		return tipo;
	}
	public void setTipo(TipoJogador tipo) {
		this.tipo = tipo;
	}
	public int getGolos() {
		
		return golos;
	}

	
	
	
	
}
