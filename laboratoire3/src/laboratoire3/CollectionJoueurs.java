package laboratoire3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionJoueurs{
	//Collection de graphiques enfants.
    private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
    private int joueurCourant;
	
	public boolean add(Joueur joueurs) {
		System.out.print("Création des joueurs : ");
		for(int i = 0; i < joueurs.getNbJoueurs(); i++) {
			listeJoueurs.add(joueurs);
			joueurCourant = i+1;
			
			System.out.print("Joueur #" + joueurCourant + ", ");
		}
		System.out.print("\n");
		creerIterateur();
		return true;
	}
	
	public void creerIterateur() {
		Iterator<Joueur> iterator = listeJoueurs.iterator();
		while(iterator.hasNext())
		{
			Joueur joueur = iterator.next();
			
			System.out.print("Joueur #" + joueurCourant + "----------");
		}
		//return iterateurJoueurs;
	}
	
	
	public int size() {
		Joueur joueurs = new Joueur();
		return joueurs.getNbJoueurs();
	}
}
