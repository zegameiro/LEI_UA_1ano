package POO108840;

public class Catering extends Activity{
    private Option option;

    public Catering (Option option, int participantes) {
        super(participantes);
        this.option = option;
        setPreco(35);
    }

    public Option getOption() {
        return option;
    }

    public String toString() {
        return "'" + option + "'" + " with " + getParticipantes() + " participants.";
    }
}
