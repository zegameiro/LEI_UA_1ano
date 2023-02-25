package POO108840;

public class Client {
    private String name, localidade;

    public Client(String name, String localidade) {
        this.name = name;
        this.localidade = localidade;
    }

    public String getName() {
        return name;
    }

    
    public String getLocalidade() {
        return localidade;
    }

    public String toString() {
        return name + " [" + localidade + "]\n";
    }
    
}
