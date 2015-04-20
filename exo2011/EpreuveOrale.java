package exo2011;

import java.util.Date;


public class EpreuveOrale  extends Epreuve{

	private double comm;
	private double rapport,support;
	
	public EpreuveOrale() {
	
	}
	public EpreuveOrale(String nomModule, Date dateEpreuve, int coeficient,double comm, double rapport, double support) {
		super(nomModule, dateEpreuve, coeficient);
		this.comm = comm;
		this.rapport = rapport;
		this.support = support;
	}


	public double getComm() {
		return comm;
	}


	public void setComm(double comm) {
		this.comm = comm;
	}


	public double getRapport() {
		return rapport;
	}


	public void setRapport(double rapport) {
		this.rapport = rapport;
	}


	public double getSupport() {
		return support;
	}


	public void setSupport(double support) {
		this.support = support;
	}


	@Override
	public double calculerNote() {
		double note=(2*comm+2*rapport+support)/5;
		
		return note;
	}

}
