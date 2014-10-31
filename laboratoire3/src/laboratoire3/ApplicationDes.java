package laboratoire3;

public class ApplicationDes {
	private static int toursCourant = 0;
	private static int joueurCourant;
	private static int deCourant;
	private static JeuBonco jeu = new JeuBonco();
	
	public static void main(String[] args) {
		System.out.print("Début du jeu"+"\n");
		System.out.print("-------------------------------------"+"\n");
		
		//ActionJeu actions = new ActionJeu();	
	}
	
	public static void jouer(CollectionJoueurs joueurs, CollectionDes des) {
		System.out.print("\n" + "\n");
		for (int i = 0; i < jeu.nbTours; i++) {
			toursCourant = i + 1;
			System.out.print("Début du tour #" + toursCourant + " : " + "\n");
			jeu.roulerDe(joueurs, des);
			System.out.print("Fin du tour -------------------------------------" + "\n" + "\n");
		}
	}
	
	public static void initialisationJeu(){
		
		creationElement();
		jouer();
		//Appel joueurs et des
        Joueur joueurs = new Joueur();
    	De des = new De();
		//Initialise les composites
	    CollectionJoueurs listeJoueurs = new CollectionJoueurs();
	    CollectionDes listeDes = new CollectionDes();
	    
	    System.out.print("Création des joueurs : ");
	    for(int i = 0; i < joueurs.getNbJoueurs(); i++) {
			listeJoueurs.add(joueurs);
			joueurCourant = i+1;
			System.out.print("Joueur #" + joueurCourant + ", ");
			System.out.print("\n");
		}
	    
	    System.out.print("Création des Dés à " + des.nbFaces + " faces : ");
	    for(int i = 0; i < des.getNbDes(); i++) {
			listeDes.add(des);
			deCourant = i+1;
			System.out.print("Dé #" + deCourant + ", ");
			System.out.print("\n");
		}
	    
	    jeu.jouer();
	}
}
