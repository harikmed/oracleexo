package pac;

import java.util.Date;

public class Test {
public static void main(String[] args) {
	Produit p =new Produit();
	Produit dell=new Produit("dell");
	dell.afficher();
	
	//p.prix=-500;// acces directe và interdir
	try {
		p.setPrix(5000);
	} catch (Exception e) {
		System.out.println("Erreur "+e.getMessage());
	}

	p.setLibelle("hp");
	System.out.println("le prix est "+p.getPrix());
	System.out.println("le libelle est "+p.getLibelle());
	ProduitAlimentaire danone=new ProduitAlimentaire("danone", 2, new Date(2015,12,10));
	
	// le polymorphisme de redefinition (overriding)
	danone.afficher();
	dell.afficher();
	System.out.println("**********************");
	dell.afficher(false);
	Fenetre f=new Fenetre();
	// la methode afficher de la classe 
	//Fenetre (qui n'a aucune relation entre les autre classe)=> polymorphisme ad-hoc 
	f.afficher();
	Produit pro=new Produit();
ProduitAlimentaire pa=new ProduitAlimentaire();
//upcasting
pro=pa;
//downcasting
pa=(ProduitAlimentaire) pro;
}
// les 3 types du polymorphismes
//1- d'heritage (ou redefinition = overriding)
//2- de surcharge (overloading)
//3- ad-hoc(passe partout)


}
