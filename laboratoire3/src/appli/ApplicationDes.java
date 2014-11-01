package appli;

public class ApplicationDes {
	//private static Joueur joueurs;
	//private static int joueurCourant;
	//private static int deCourant;
	private static CreateurJeu createur = new CreateurJeu();
	
	public static void main(String[] args) {
		System.out.print("Choix des paramètre du jeu :"+"\n\n");
		
		//Possibilité d'ajout le choix du jeu, pour le bien du laboratoire, le jeu bonco+ est déjà sélectionné
		createur.creeJeu();
	}
	
	/*public static void jouer(CollectionJoueurs joueurs, CollectionDes des) {
		System.out.print("\n" + "\n");
		for (int i = 0; i < jeu.nbTours; i++) {
			toursCourant = i + 1;
			System.out.print("Début du tour #" + toursCourant + " : " + "\n");
			jeu.roulerDe(joueurs, des);
			System.out.print("Fin du tour -------------------------------------" + "\n" + "\n");
		}
	}*/
}
