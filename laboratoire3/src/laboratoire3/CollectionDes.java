package laboratoire3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDes{
	//Collection de graphiques enfants.
    private ArrayList<De> listeDes = new ArrayList<De>();
    private int deCourant;

	public void creerIterateur() {
		//return iterateurDes;
	}

	public boolean add(De des) {
		System.out.print("Création des Dés à " + des.nbFaces + " faces : ");
		for(int i = 0; i < des.getNbDes(); i++) {
			listeDes.add(des);
			deCourant = i+1;
			System.out.print("Dé #" + deCourant + ", ");
		}	
		System.out.print("\n");
		return false;
	}

	public int size() {
		De des = new De();
		return des.getNbDes();
	}
}