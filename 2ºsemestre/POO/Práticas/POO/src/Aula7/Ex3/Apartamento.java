package Aula7.Ex3;

public class Apartamento extends Alojamento {
    
    private int quartos;

    public Apartamento(String codigo,String nome,String local,double preco,boolean disp,double aval,int quartos){
        super(codigo, nome, local, preco, disp, aval);
        this.quartos = quartos;
    }

    public int getQuartos(){
        return quartos;
    }
    public void setQuartos(int q){
        quartos = q;
    }
    @Override
    public String toString(){
        return "\nCódigo: " + getCodigo() + 
                ";\nNome: " + getNome() + 
                ";\nLocal: " + getLocal() + 
                ";\nPreço: " + getPreco() + 
                ";\nDisponibilidade: " + getDisp() + 
                ";\nAvaliação: " + getAval() + 
                ";\nQuartos: " + quartos;
    }
}
