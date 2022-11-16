package Aula8.Ex1;

public class Pesadopass extends Automovel{
    
    private double peso;
    private int passageiros;

    public Pesadopass(String matricula,String marca,String modelo,double potencia,int quadro,double peso,int passageiros){
        super(matricula,marca,modelo,potencia,quadro);
        this.peso = peso;
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int pas) {
        passageiros = pas;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double pe) {
        peso = pe;
    }

    public String toString(){
        return "Automóvel Pesado de Mercadorias\nMatricula: " + getMatricula() + ";\nMarca: " + getMarca() + ";\nModelo: " + getModelo() + ";\nPotência: " + getPotencia() + " cv;\nNúmero do Quadro: " + getNumquadro() + ";\nPeso: " + getPeso() + " kg;\nNúmero Máximo de Passageiros: " + getPassageiros() + "\n----------------------------------\n";
    }
}
