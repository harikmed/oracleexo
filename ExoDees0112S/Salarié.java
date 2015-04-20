package ExoDees0112S;

public class Salarié extends Employé {
private double tarif_horaire;
private int nombreHeure;
public Salarié() {
	// TODO Auto-generated constructor stub
}
public Salarié(String nom,double tarif_horaire,int nombreHeure) {
	super(nom);
	this.tarif_horaire=tarif_horaire;
	this.nombreHeure=nombreHeure;
}
public double getTarif_horaire() {
	return tarif_horaire;
}

public void setTarif_horaire(double tarif_horaire) {
	this.tarif_horaire = tarif_horaire;
}

public int getNombreHeure() {
	return nombreHeure;
}

public void setNombreHeure(int nombreHeure) {
	this.nombreHeure = nombreHeure;
}


	
	@Override
	public double cacul_salaire() {
		
double salaire =0;
		if (nombreHeure>35) {
			salaire=tarif_horaire*35+(nombreHeure-35)*tarif_horaire*1.25;
		} else {
salaire=tarif_horaire*nombreHeure;
		}
		return salaire;
	}

}
