package Aula8.Ex2;

public class Pratodieta extends Prato {
	
	private double maxCaloria;
	
	//Construtor
	public Pratodieta(String nome, double maxCaloria)
	{
		super(nome);
		this.maxCaloria = maxCaloria;
	}
	
	public double maxCaloria() { return maxCaloria; }
	
	@Override public String toString()
	{
		return "Dieta -> ("+maxCaloria+") "+ super.toString();
	}
	public boolean addIngrediente(Alimento a)
	{
		if(super.composicao().contains(a) || a==null || ((a.calorias()+super.maxCalorias()) >= maxCaloria))
			return false;
		else {
			super.addIngrediente(a);
			return true;
		}		
	}
	

}


