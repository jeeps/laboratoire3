package appli;

public class Jeu {
	private IStrategie strategie;
	private int nbTours;
	private int nbJoueurs;
	private int nbDes;
	private int nbFacesDe;
	//protected boolean valeurParDefaut;
	//abstract void initialisationJeu();
   // abstract void calculerScoreTour();
    //private boolean finJeu;
    //abstract void calculerLeVainceur();
	
	public Jeu(IStrategie strategie) {
		this.strategie = strategie;
		this.strategie.preparerValeurParDefaut(this);
	}
	
	public void calculerScoreTour() {
		strategie.calculerScoreTour(this);
	}
	
	public void calculerLeVainceur() {
		strategie.calculerLeVainceur(this);
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

	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}
	
	public int getNbTours() {
		return nbTours;
	}
	
	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	
	public int getNbJoueurs() {
		return nbJoueurs;
	}
	
	public void setNbDes(int nbDes) {
		this.nbDes = nbDes;
	}
	
	public int getNbDes() {
		return nbDes;
	}
	
	public void setNbFacesDe(int nbFacesDe) {
		this.nbFacesDe = nbFacesDe;
	}
	
	public int getNbFacesDe() {
		return nbFacesDe;
	}
}
