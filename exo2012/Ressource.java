package exo2012;

public abstract class Ressource {

 private String nom;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}
	
public abstract double calculer_mont_location();
	
public Ressource(){}

public Ressource(String nom){
	
	this.nom=nom;
}


}
