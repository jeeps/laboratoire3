package laboratoire3;

public class ApplicationDes {
	private static int toursCourant = 0;
	
	public static void main(String[] args) {
		System.out.print("Début du jeu"+"\n");
		System.out.print("-------------------------------------"+"\n");
        
        //Appel joueurs et des
        Joueur listeJoueurs = new Joueur();
    	De listeDes = new De();
		//Initialise les composites
	    CollectionJoueurs joueurs = new CollectionJoueurs();
	    CollectionDes des = new CollectionDes();
	    
	    joueurs.add(listeJoueurs);
	    des.add(listeDes);
	    
		jouer(joueurs, des);		
	}
	
	public static void jouer(CollectionJoueurs joueurs, CollectionDes des) {
		Jeu jeu = new Jeu();
		
		System.out.print("\n" + "\n");
		for (int i = 0; i < jeu.nbTours; i++) {
			toursCourant = i + 1;
			System.out.print("Début du tour #" + toursCourant + " : " + "\n");
			jeu.roulerDe(joueurs, des);
			System.out.print("Fin du tour -------------------------------------" + "\n" + "\n");
		}
	}
}
