package Aula8.Ex1;

public class Taxi extends Autoligeiro {

    private String licenca;

    public Taxi(String matricula,String marca,String modelo,double potencia,int quadro,double bagageira,String licenca){
        super(matricula, marca, modelo, potencia, quadro, bagageira);
        this.setLicenca(licenca);
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    public String toString(){
        return "Automóvel ligeiro - Táxi\nMatricula: " + getMatricula() + ";\nMarca: " + getMarca() + ";\nModelo: " + getModelo() + ";\nPotência: " + getPotencia() + " cv;\nNúmero do Quadro: " + getNumquadro() + ";\nCapacidade da bagageira: " + getBagageira() + " L;\nNúmero de Licença: " + getLicenca() + ".\n----------------------------------\n";
    }
    
}
