package ExoDees0112S;

import java.util.ArrayList;
import java.util.List;

public class Paie {
public static void main(String[] args) {
	List<Employé> listeEmployés=new ArrayList<Employé>();
	listeEmployés.add(new Stagiaire("FORTON",1000,300 ));
	listeEmployés.add(new Stagiaire("LEGRAND",650,500 ));
	listeEmployés.add(new Salarié("DUPOND",220,40));
	for (int i = 0; i < listeEmployés.size(); i++) {
		System.out.println("le salaire de "+listeEmployés.get(i).getNom()+" est "+listeEmployés.get(i).cacul_salaire()+" dhs");
		
		
	}
	
}
}
