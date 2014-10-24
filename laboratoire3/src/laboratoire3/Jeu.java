package laboratoire3;

public class Jeu {
	public int nbTours = 6;
	private static int joueurCourant;
	private static int deCourant;
	private int valeurDeAleatoire;
	
	public Jeu() {
		
	}

	public void roulerDe(CollectionJoueurs joueurs, CollectionDes des) {
		for(int i = 0; i < joueurs.size(); i++) {
			joueurCourant = i + 1;
			System.out.print("Le joueur #" + joueurCourant + " joue ..." + "\n");
			for(int j = 0; j < des.size(); j++) {
				deCourant = j + 1;
				valeurDeAleatoire = (int) (Math.random() * De.nbFaces + 1);
				
				if (des.size() == deCourant){
					System.out.print("le dé #" + deCourant + " obtient " + valeurDeAleatoire + "\n");
				}
				else {
					System.out.print("le dé #" + deCourant + " obtient " + valeurDeAleatoire + ", ");
				}
			}
		}
	}
}
