package POO_P12_108840;

public class Festival {
    private String dataInicial,dataFim,name,place;
    private int nTickets;

    public Festival(String dataInicial,String dataFim,String name,String place,int nTickets) {
        this.dataInicial = dataInicial;
        this.dataFim = dataFim;
        this.name = name;
        this.place = place;
        this.nTickets = nTickets;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getNTickets() {
        return nTickets;
    }

    public void setDataIn(String di) {
        dataInicial = di;
    }

    public void setDataFim(String df) {
        dataFim = df;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPlace(String p) {
        place = p;
    }

    public void setNTickets(int nt) {
        nTickets = nt;
    }
}
