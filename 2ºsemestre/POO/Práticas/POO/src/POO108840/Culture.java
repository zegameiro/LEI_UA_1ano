package POO108840;

public class Culture extends Activity{
    private Option option;

    public Culture(Option option, int participantes) {
        super(participantes);
        this.option = option;
        setPreco(25);
    }

    public Option getOption() {
        return option;
    }

    public String toString() {
        return option + " option for " + getParticipantes() + " participants.\n";
    }

    
}
