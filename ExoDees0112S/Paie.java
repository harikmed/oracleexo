package ExoDees0112S;

import java.util.ArrayList;
import java.util.List;

public class Paie {
public static void main(String[] args) {
	List<Employ�> listeEmploy�s=new ArrayList<Employ�>();
	listeEmploy�s.add(new Stagiaire("FORTON",1000,300 ));
	listeEmploy�s.add(new Stagiaire("LEGRAND",650,500 ));
	listeEmploy�s.add(new Salari�("DUPOND",220,40));
	for (int i = 0; i < listeEmploy�s.size(); i++) {
		System.out.println("le salaire de "+listeEmploy�s.get(i).getNom()+" est "+listeEmploy�s.get(i).cacul_salaire()+" dhs");
		
		
	}
	
}
}
