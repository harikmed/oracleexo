package exo2012;

import java.util.ArrayList;
import java.util.Iterator;

public class Location {

	public static void main(String[] args) {
		
		//Ressource s1=new Salle("Salle A13",15,200); =>UpCasting
		
		//Salle s1=new Ressource("Salle A13",15,200); =>DownCasting *
		
		Salle s1=new Salle("Salle A13",15,200);
		
		Salle s2 =new Salle("Salle B05", 5, 150);
		
		Materiel m1=new Materiel("Téléviseur LCD 2", 50, 10);
		
		Materiel m2=new Materiel("Lecteur DVD 4", 30, 0);
		
		ArrayList<Ressource> ListeRessource=new ArrayList<Ressource>();
		
		ListeRessource.add(s1);
		
		ListeRessource.add(s2);	
		
		ListeRessource.add(m1);
		
		ListeRessource.add(m2);
		
		for (int i = 0; i < ListeRessource.size(); i++) {
			
			double montant= ListeRessource.get(i).calculer_mont_location();
			
			System.out.println("Le montant de location de "+ListeRessource.get(i).getNom()+" est "+montant);
		}
		System.out.println("------------------------------------");
		Ressource  r[]={s1,s2,m1,m2};
		
		for (int i = 0; i < r.length; i++) {
			double montant= r[i].calculer_mont_location();
			
			System.out.println("Le montant de location de "+r[i].getNom()+" est "+montant);
		}
		System.out.println("FIN DE PROGRAMME - BYE BYE");
	}
	

}










