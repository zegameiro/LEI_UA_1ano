package POO108840;

public class Activity {
    private int participantes,preco;

    public Activity(int participantes) {
        this.participantes = participantes;
    }
    
    public int getParticipantes(){
        return participantes;
    }

    
    public int getPreco() {
        return preco;
    }

    public void setPreco(int p) {
        preco = p;
    }

}
