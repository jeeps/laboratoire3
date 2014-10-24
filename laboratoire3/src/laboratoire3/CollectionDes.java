package laboratoire3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDes implements Collection<De>{
	//Collection de graphiques enfants.
    private ArrayList<De> listeDes = new ArrayList<De>();
    private int deCourant;

	public void creerIterateur() {
		//return iterateurDes;
	}

	@Override
	public boolean add(De des) {
		System.out.print("Création des Dés à " + des.nbFaces + " faces : ");
		for(int i = 0; i < des.nbDes; i++) {
			listeDes.add(des);
			deCourant = i+1;
			System.out.print("Dé #" + deCourant + ", ");
		}	
		System.out.print("\n");
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends De> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<De> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return De.nbDes;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
}