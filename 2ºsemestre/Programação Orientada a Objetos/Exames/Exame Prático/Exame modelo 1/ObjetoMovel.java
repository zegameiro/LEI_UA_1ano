package ExamePratico;

public class ObjetoMovel {
	private int x,y;
	private int velocidade,distancia;
	public void move(int newX,int newY) {
		distancia+=Math.sqrt(Math.pow(newX-x, 2)+Math.pow(newY-y, 2));
		this.x=newX;
		this.y=newY;
	}
	public void move(int newX,int newY,double velocidade) {
		distancia+=Math.sqrt(Math.pow(newX-x, 2)+Math.pow(newY-y, 2));
		this.x=newX;
		this.y=newY;
		
	}
	public ObjetoMovel(int x, int y, int velocidade, int distancia) {
		super();
		this.x = x;
		this.y = y;
		this.velocidade = velocidade;
		this.distancia = distancia;
	}
	public ObjetoMovel(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	@Override
	public String toString() {
		return "ObjetoMovel [x=" + x + ", y=" + y + ", velocidade=" + velocidade + ", distanciaPercorrida="
				+ distancia + "]";
}
	
}
