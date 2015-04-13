package pac;

import java.util.Date;

public class ProduitAlimentaire extends Produit {
// le 2 eme principe de la poo : héritage => role principale =>
//	reutiliser le code existant (une classe fille herite d'une classe mere (super)) 
	
	private Date datexpiration;
	
	public Date getDatexpiration() {
		return datexpiration;
	}
	public void setDatexpiration(Date datexpiration) {
		this.datexpiration = datexpiration;
	}
	public ProduitAlimentaire() {
	
	}
	public ProduitAlimentaire(String libelle, double prix, Date dateexpiration ) {
		super(libelle, prix);
		this.datexpiration=dateexpiration;
	}
	@Override
		public void afficher() {
			
			super.afficher();
			System.out.println("la date d'expiration est "+datexpiration);
		}
	
	@Override
		public void afficher(boolean estMajiscule) {
			// TODO Auto-generated method stub
			super.afficher(estMajiscule);
		}
	
}
