package Aula7.Ex3;

public class Alojamento {
    private String codigo;
    private String nome;
    private String local;
    private double preco;
    private boolean disp;
    private double aval;
    
    public Alojamento(String codigo,String nome,String local,double preco,boolean disp,double aval){
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.preco = preco;
        this.disp = disp;
        this.aval = aval;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getLocal(){
        return local;
    }
    public double getPreco(){
        return preco;
    }
    public boolean getDisp(){
        return disp;
    }
    public double getAval(){
        return aval;
    }

    public void setCodigo(String c){
        codigo = c;
    }
    public void setNome(String n){
        nome = n;
    }
    public void setLocal(String l){
        local = l;
    }
    public void setPreco(double p){
        preco = p;
    }
    public void setDisp(boolean d){
        disp = d;
    }
    public void setAval(double a){
        aval = a;
    }

    @Override
    public String toString(){
        return "\nCódigo: " + codigo + 
                ";\nNome: " + nome + 
                ";\nLocal: " + local + 
                ";\nPreço: " + preco + 
                ";\nDisponibilidade: " + disp + 
                ";\n Avaliação: " + aval;
    }
}
