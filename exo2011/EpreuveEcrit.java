package exo2011;

import java.util.Date;

public class EpreuveEcrit extends Epreuve {
private double qcm,exercice;

	
	public double getQcm() {
	return qcm;
}


public void setQcm(double qcm) {
	this.qcm = qcm;
}


public double getExercice() {
	return exercice;
}


public void setExercice(double exercice) {
	this.exercice = exercice;
}

public EpreuveEcrit() {
	// TODO Auto-generated constructor stub
}
public EpreuveEcrit(String nomModule, Date dateEpreuve, int coeficient,double qcm, double exercice) {
	super(nomModule, dateEpreuve, coeficient);
	this.qcm=qcm;
	this.exercice=exercice;
}


	@Override
	public double calculerNote() {
	double note=(qcm+exercice*4)/5;
		return note;
	}

}
