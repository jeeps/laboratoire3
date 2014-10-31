package laboratoire3;

public class Joueur implements Comparable<Joueur>{
	private static int nbJoueurs = 4;
	
	public Joueur(){
	}
	
	public int getNbJoueurs(){
		return nbJoueurs;
	}

	@Override
	public int compareTo(Joueur arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}