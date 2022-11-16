package Aula8.Ex1;

public class Automovel extends Viatura{

    private int numquadro;

    public Automovel(String matricula, String marca, String modelo, double potencia,int numquadro) {
        super(matricula, marca, modelo, potencia);
        this.numquadro = numquadro;
    }

    public int getNumquadro(){
        return numquadro;
    }
    public void setNumquadro(int nq){
        numquadro = nq;
    }
    
}
