package ExoDees0112S;

public abstract class Employé {
private String nom;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}
public Employé() {
	// TODO Auto-generated constructor stub
}

public Employé(String nom) {
	
	this.nom = nom;
}
public abstract double cacul_salaire();

}
