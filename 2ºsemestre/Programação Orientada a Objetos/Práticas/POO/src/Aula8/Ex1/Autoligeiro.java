package Aula8.Ex1;

public class Autoligeiro extends Automovel{

    private double bagageira;

    public Autoligeiro(String matricula,String marca,String modelo,double potencia,int quadro,double bagageira) {
        super(matricula, marca, modelo, potencia,quadro);
        this.bagageira = bagageira;
    }

    public double getBagageira() {
        return bagageira;
    }

    public void setBagageira(double bagageira) {
        this.bagageira = bagageira;
    }
    
    public String toString(){
        return "Automóvel ligeiro\nMatricula: " + getMatricula() + ";\nMarca: " + getMarca() + ";\nModelo: " + getModelo() + ";\nPotência: " + getPotencia() + " cv;\nNúmero do Quadro: " + getNumquadro() + ";\nCapacidade da bagageira: " + getBagageira() + "L.\n----------------------------------\n";
    }
}
