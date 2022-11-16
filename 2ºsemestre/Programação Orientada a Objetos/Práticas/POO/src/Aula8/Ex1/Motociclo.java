package Aula8.Ex1;

public class Motociclo extends Viatura {
    
    private String tipo;

    public Motociclo(String matricula,String marca,String modelo,double potencia,String tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String t){
        tipo = t;
    }

    public String toString(){
        return "Motociclo\nMatrícula: " + getMatricula() + ",\nMarca: " + getMarca() + ";\nModelo: " + getModelo() + ";\nPotencia: " + getPotencia() + ";\nTipo: " + getTipo() +".\n----------------------------------\n" ;
    }
}
