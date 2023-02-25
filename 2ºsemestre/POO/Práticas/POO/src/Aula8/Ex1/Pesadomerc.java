package Aula8.Ex1;

public class Pesadomerc extends Automovel{

    private double peso,carga;

    public Pesadomerc(String matricula,String marca,String modelo,double potencia,int quadro,double peso,double carga){
        super(matricula,marca,modelo,potencia,quadro);
        this.peso = peso;
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double c) {
        carga = c;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double p) {
        peso = p;
    } 

    public String toString(){
        return "Automóvel Pesado de Mercadorias\nMatricula: " + getMatricula()
        + ";\nMarca: " + getMarca()
        + ";\nModelo: "  + getModelo()
        + ";\nNúmero do Quadro: " + getNumquadro() 
        + ";\nPeso: " + getPeso() 
        + " kg;\nCarga Máxima: " + getCarga()
        + "L.\n----------------------------------\n";
    }
}
