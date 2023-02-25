package Aula7.Ex3;

public class Carro {

    private int id;
    private char classe;
    private String motor;
    private boolean disp;
    private static int count = 0;

    public Carro(char classe,String motor){
        this.classe = classe;
        this.motor = motor;
        disp = true;
        this.id = ++count;
    }

    public char getClasse(){
        return classe;
    }
    public String getMotor(){
        return motor;
    }

    public void setClasse(char c){
        classe = c;
    }
    public void setMotor(String m){
        motor = m;
    }

    public boolean isDisponivel() {
        return disp;
    }

    public void setDisponivel(boolean dsp) {
        disp = dsp;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int c) {
        Carro.count = c;
    }

    @Override    
    public String toString(){
        return  "Código: " + id +
                "\nClasse: " + classe + 
                ";\nMotorização: " + motor + 
                ";\nDisponibilidade: " + disp;
    }
}
