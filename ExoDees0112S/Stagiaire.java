package ExoDees0112S;

public class Stagiaire extends Employé {
private double somme_fixe,prime;

	public double getPrime() {
	return prime;
}

public void setPrime(double prime) {
	this.prime = prime;
}

	public double getSomme_fixe() {
	return somme_fixe;
}

public void setSomme_fixe(double somme_fixe) {
	this.somme_fixe = somme_fixe;
}

	
public Stagiaire() {
	// TODO Auto-generated constructor stub
}
public Stagiaire(String nom, double somme_fixe,double prime) {
super(nom);
this.somme_fixe=somme_fixe;
this.prime=prime;
}
@Override
public double cacul_salaire() {
	double salaire=somme_fixe+prime;
	return salaire;
}

}
