package Aula8.Ex1;

import java.util.ArrayList;

public class Empresa {
    
    private String nome,cpostal,email;
    private ArrayList<Viatura> viaturas;

    public Empresa(String nome,String cpostal,String email){
        this.nome = nome;
        this.cpostal = cpostal;
        this.email = email;
        this.viaturas = new ArrayList<Viatura>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpostal() {
        return cpostal;
    }

    public void setCpostal(String cpostal) {
        this.cpostal = cpostal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addViatura(Viatura v) {
		this.viaturas.add(v);
	}
	
    public String toString(){
        return "Empresa: " + getNome() + ";\nEmail: " + getEmail() + ";\nCódigo Postal: " + getCpostal() + "\nViaturas: " + viaturas + "\n"; 
    }
    
}
