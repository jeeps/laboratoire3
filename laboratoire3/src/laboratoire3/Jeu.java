package laboratoire3;

public abstract class Jeu {
	public int nbTours = 6;
	//abstract void initialisationJeu();
    abstract void calculerScoreTour();
    abstract boolean finJeu();
    abstract void calculerLeVainceur();
	
	public Jeu() {
		
	}
	
	public final void jouer() {
		System.out.print("as");
        int j = 0;
        while (!finJeu()) {
        	calculerScoreTour();
            j = (j + 1) % nbTours;
        }
        
        calculerLeVainceur();
    }

	public void roulerDe(CollectionJoueurs joueurs, CollectionDes des) {
		/*for(int i = 0; i < joueurs.size(); i++) {
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
		}*/
	}
}
