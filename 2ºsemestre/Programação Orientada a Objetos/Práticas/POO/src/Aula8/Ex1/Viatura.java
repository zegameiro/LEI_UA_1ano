package Aula8.Ex1;

public class Viatura implements KmPercorridosInterface{
    private String matricula,marca,modelo;
    private double potencia, trajeto, distanciaTotal;

    public Viatura(String matricula,String marca,String modelo,double potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double pot) {
        potencia = pot;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String mod) {
        modelo = mod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String mar) {
        marca = mar;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String mat) {
        matricula = mat;
    }

    @Override
    public void trajeto(int quilometros) {
        trajeto = quilometros;
        distanciaTotal += trajeto;
        
    }

    @Override
    public double ultimoTrajeto() {
        return trajeto;
    }

    @Override
    public double distanciaTotal() {
        return distanciaTotal;
    }
}
