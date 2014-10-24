package laboratoire3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionJoueurs implements Collection<Joueur>{
	//Collection de graphiques enfants.
    private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
    private int joueurCourant;

	public void creerIterateur() {
		//return iterateurJoueurs;
	}

	@Override
	public boolean add(Joueur joueurs) {
		System.out.print("Création des joueurs : ");
		for(int i = 0; i < joueurs.nbJoueurs; i++) {
			listeJoueurs.add(joueurs);
			joueurCourant = i+1;
			
			System.out.print("Joueur #" + joueurCourant + ", ");
		}
		System.out.print("\n");
		return false;
	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		
		return Joueur.nbJoueurs;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
