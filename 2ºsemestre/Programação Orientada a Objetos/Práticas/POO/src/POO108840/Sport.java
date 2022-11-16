package POO108840;

public class Sport extends Activity {
    private Modality modality;

    public Sport(Modality modality,int participantes) {
        super(participantes);
        this.modality = modality;
        setPreco(30);
    }

    public Modality getModality() {
        return modality;
    }

    public String toString() {
        return modality + " activity for " + getParticipantes() + "participants.\n";
    }
    
    
}
