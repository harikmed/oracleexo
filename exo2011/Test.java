package exo2011;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
public static void main(String[] args) {
	//construction epreuve orale 
	
	EpreuveOrale eo=new EpreuveOrale("java", new Date(2015, 04, 20), 2, 10, 10, 10);
	EpreuveEcrit ee=new EpreuveEcrit("java",  new Date(2015, 04, 20), 2, 10, 10);

//	Epreuve ep[]=new Epreuve[2];
//	ep[0]=new EpreuveOrale("java", new Date(2015, 04, 20), 2, 10, 10, 10);
//	ep[1]=new EpreuveEcrit("java",  new Date(2015, 04, 20), 2, 10, 10);
//
//	
//	for (int i = 0; i < ep.length; i++) {
//	System.out.println("la note est "+ep[i].calculerNote());	
//	}
// les arrayListes => tableau dynamique 
	List<Epreuve> ep=new ArrayList<Epreuve>();
	ep.add(eo);
	ep.add(ee);
	
	for (int i = 0; i < ep.size(); i++) {
		System.out.println("la note est "+ep.get(i).calculerNote());
	}
	
	
}
}
