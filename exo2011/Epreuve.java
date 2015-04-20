package exo2011;

import java.util.Date;

public abstract class Epreuve {
private String nomModule;
private Date dateEpreuve;
private int coeficient;
public String getNomModule() {
	return nomModule;
}
public void setNomModule(String nomModule) {
	this.nomModule = nomModule;
}
public Date getDateEpreuve() {
	return dateEpreuve;
}
public void setDateEpreuve(Date dateEpreuve) {
	this.dateEpreuve = dateEpreuve;
}
public int getCoeficient() {
	return coeficient;
}
public void setCoeficient(int coeficient) {
	this.coeficient = coeficient;
}
public Epreuve (){}
public Epreuve(String nomModule, Date dateEpreuve, int coeficient) {
	
	this.nomModule = nomModule;
	this.dateEpreuve = dateEpreuve;
	this.coeficient = coeficient;
}

public abstract double calculerNote() ;





}
