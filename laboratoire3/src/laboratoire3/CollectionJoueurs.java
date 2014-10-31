package laboratoire3;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionJoueurs{
    private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
    
	public void add(Joueur joueurs) {
		listeJoueurs.add(joueurs);
	}
	
	public Iterator<Joueur> creerIterateur() {
		Iterator<Joueur> iteratorJoueurs = listeJoueurs.iterator();
		return iteratorJoueurs;
	}
}
