package pac;

public class Produit {
	//les attributs
	// respect du 1 er principe de la poo => encapsulation (cacher les données et autorisé leur acces par des getters et setters x)
private 	String libelle;
private 	double prix;
// mutateur setters 
public void setPrix(double prix) throws Exception  {
	if(prix < 0){
	throw new Exception("Le prix doit etre >=0");
	}else 
	this.prix = prix;
}
public double getPrix() {
	return prix;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public String getLibelle() {
	return libelle;
}
//les construteurs => role => initialiser les attributs
public Produit(String libelle , double prix){
	this.libelle=libelle;
	this.prix=prix;

}

public Produit() {
	
}

public Produit(String libelle){
	this.libelle=libelle;
}
// le surcharge ou overloading => meme methode qui porte des parametres diffrents en nombre et/ou en type

public void  afficher(){
System.out.println("libelle est "+libelle);
System.out.println("le prix est "+prix);
}

public void afficher(boolean estMajiscule){
	if (estMajiscule==true) {
		System.out.println("Libelle est"+libelle.toUpperCase());
	}else {
		System.out.println("Libelle est "+libelle.toLowerCase());
	}
}




}
