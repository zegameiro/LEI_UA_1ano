package Aula8.Ex1;

public class PesadoPassEletrico extends Pesadopass implements VeiculoEletrico{

    private int autonomiamax, percentagem;

    public PesadoPassEletrico(String matricula,String marca,String modelo,double potencia,int quadro,double peso,int passageiros,int autonomiamax){

        super(matricula, marca, modelo, potencia, quadro, peso, passageiros);

        this.autonomiamax = autonomiamax;
        
    }

    public int getAutonomiamax() {

        return autonomiamax;

    }

    public void setAutonomiamax(int automax) {

        autonomiamax = automax;

    }

    @Override
    public int autonomia() {
        
        return percentagem * autonomiamax / 100;

    }

    @Override
    public void carregar(int percentagem) {

        if(percentagem < this.percentagem){

            System.out.println("Não dá");

        } else{

            this.percentagem = percentagem;

        }
        
    }

    public String toString(){

        return "Pesado Passageiros Elétrico\nMatricula: " + getMatricula() + ";\nMarca: " + getMarca() + ";\nModelo: " + getModelo() + ";\nPotência: " + getPotencia() + " cv;\nNúmero do Quadro: " + getNumquadro() + ";\nNúmero de Passageiros Máximo: " + getPassageiros() + "L.\nAutonomia Máxima: " + getAutonomiamax() + " km\n----------------------------------";
    }
    
    
}
