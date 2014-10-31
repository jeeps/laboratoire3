package laboratoire3;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDes{
    private ArrayList<De> listeDes = new ArrayList<De>();

	public void add(De des) {
		listeDes.add(des);
	}
	
	public Iterator<De> creerIterateur() {
		Iterator<De> iteratorDes = listeDes.iterator();
		return iteratorDes;
	}
}