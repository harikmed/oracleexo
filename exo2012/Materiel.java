package exo2012;

public class Materiel extends Ressource {

	private int nbrheureres;
	
	private int nbrheuresupp;
	

	public int getNbrheureres() {
		return nbrheureres;
	}




	public void setNbrheureres(int nbrheureres) {
		this.nbrheureres = nbrheureres;
	}




	public int getNbrheuresupp() {
		return nbrheuresupp;
	}


	public Materiel(){}
	
	public Materiel(String nom,int nbrheureres,int nbrheuresupp)
	{
		super(nom);
		
		this.nbrheureres=nbrheureres;
		
		this.nbrheuresupp=nbrheuresupp;
		
	}

	public void setNbrheuresupp(int nbrheuresupp) {
		this.nbrheuresupp = nbrheuresupp;
	}




	@Override
	public double calculer_mont_location() {
		double montant=(nbrheureres*10)+(nbrheuresupp*11);
		
		return montant;
	}
	
	

}
