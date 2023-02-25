package POO_P12_108840;

public class Pessoa {
    private String name;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String name, int cc, DateYMD dataNasc) {
		this.name = name; 
		this.cc = cc; 
		this.dataNasc = dataNasc;
	}

	public String getName() {
		return name;
	}

	public int getCc() {
		return cc;
	}

	public DateYMD getDataNasc() {
		return dataNasc;
	}

	public void setNome(String n) {
		name = n;
	}

	public void setCc(int c) {
		cc = c;
	}

	public void setDataNasc(DateYMD dn) {
		dataNasc = dn;
	}

    @Override
	public String toString() {
		return "Nome: " + name + ",\nCC: " + cc + ",\nData de Nascimento: " + dataNasc.toString();
	}
}


