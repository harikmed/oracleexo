package exo2012;

public class Salle extends Ressource {

	private int nbrjour;
	
	private double tarif;
	
	public int getNbrjour() {
		return nbrjour;
	}

	public void setNbrjour(int nbrjour) {
		this.nbrjour = nbrjour;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}
	
	public Salle(){}
	
	public Salle(String nom,int nbrjour,double tarif)
	{
	 super(nom);
	 
	 this.nbrjour=nbrjour;
	 
	 this.tarif=tarif;
	
	}

	@Override
	public double calculer_mont_location() {
		double montant=tarif*nbrjour;
		
		
		return montant;
	}

	
	
}
