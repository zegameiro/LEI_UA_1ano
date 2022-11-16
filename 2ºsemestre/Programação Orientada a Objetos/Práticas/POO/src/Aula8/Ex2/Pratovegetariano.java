package Aula8.Ex2;

public class Pratovegetariano extends Prato {
	
	//Construtor
	public Pratovegetariano(String nome)
	{
		super(nome);
	}
	
	@Override public String toString()
	{
		return "Vegetariano -> "+super.toString();
	}
	public boolean addIngrediente(Alimento a)
	{
		if(super.composicao().contains(a) || a==null || a instanceof AlimentoVeg)
			return false;
		else {
			super.addIngrediente(a);
			return true;
		}
	}

}
