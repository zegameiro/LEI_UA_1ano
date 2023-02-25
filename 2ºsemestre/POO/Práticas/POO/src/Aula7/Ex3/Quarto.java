package Aula7.Ex3;

public class Quarto extends Alojamento {
    private String type;

    public Quarto(String codigo,String nome,String local,double preco,boolean disp,double aval,String type){
        super(codigo, nome, local, preco, disp, aval);
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setType(String t){
        type = t;
    }
    
    @Override
    public String toString(){
        return  "\nCódigo: " + getCodigo() + 
                ";\nNome: " + getNome() + 
                ";\nLocal: " + getLocal() + 
                ";\nPreço: " + getPreco() + 
                ";\nDisponibilidade: " + getPreco() + 
                ";\nAvaliação: " + getAval() + 
                ";\nTipo de quarto: " + type;
    }
}