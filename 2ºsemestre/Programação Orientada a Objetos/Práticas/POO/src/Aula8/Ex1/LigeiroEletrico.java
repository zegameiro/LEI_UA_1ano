package Aula8.Ex1;

public class LigeiroEletrico extends Autoligeiro implements VeiculoEletrico{

    private int autonomiamax, percentagem;

    public LigeiroEletrico(String matricula,String marca,String modelo,double potencia,int quadro,double bagageira, int autonomiamax){

        super(matricula, marca, modelo, potencia, quadro, bagageira);
        this.autonomiamax = autonomiamax;

    }

    public int getAutonomiaMax(){

        return autonomiamax;

    }

    public void setAutonomiaMax(int autom){

        autonomiamax = autom;

    }

    @Override
    public int autonomia() {

        return percentagem * autonomiamax / 100;

    }

    @Override
    public void carregar(int percent) {

        if(percent < this.percentagem || percent < 0 || percent > 100){

            System.out.println("O carregamento não é possível de realizar!");
            System.out.println(percentagem);

        } else{

            this.percentagem = percent;
            System.out.println("Carregamento de" + percentagem + "efetuado com sucesso!"); 

        }
        
    }

    public String toString(){
        return "Automóvel ligeiro Elétrico\nMatricula: " + getMatricula() + ";\nMarca: " + getMarca() + ";\nModelo: " + getModelo() + ";\nPotência: " + getPotencia() + " cv;\nNúmero do Quadro: " + getNumquadro() + ";\nCapacidade da bagageira: " + getBagageira() + "L.\nAutonomia Máxima: " + getAutonomiaMax() + " km\n----------------------------------";
    }

    
}
