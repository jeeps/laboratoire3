package appli;

import java.util.Iterator;

import bunco.JeuBunco;

public class CreateurJeu {
	//Initialise des éléments de jeu
	private static String[] nomFictif = {"Maxime","Jean","Roger", "Jessica", "Karine", "Roxanne"};
	private static String[] strategieChoisie = {"Bunco"};	
    private static CollectionJoueurs listeJoueurs = new CollectionJoueurs();
    private static CollectionDes listeDes = new CollectionDes();
    //private static De des;
    private static boolean replay = false;
	
	public static void creeJeu() {
		//Pour changer de stratégie, simplement modifier «new JeuBonco()» pour l'autre stratégie
		System.out.print("Les règles sont celles de : " + strategieChoisie[0] + "\n\n");
		Jeu jeu = new Jeu(new JeuBunco());
		
		initialiseElementsJeu(jeu.getNbTours(), jeu.getNbJoueurs(), jeu.getNbDes());
		debutPartie(jeu, listeJoueurs.creerIterateur());
	}
	
	public static void initialiseElementsJeu(int nbTours, int nbJoueurs, int nbDes){	    
	    System.out.print("Listes des joueurs : ");
	    for(int i = 0; i < nbJoueurs; i++) {
			listeJoueurs.add(new Joueur(nomFictif[i]));
		}
	    
	    System.out.print("\n\n" + "Chaque joueur à " + nbDes + " dés");
	    for(int i = 0; i < nbDes; i++) {
			listeDes.add(new De(6, 0));
		}
	    System.out.print("\n\n" + "Nombre de tours " + nbTours);
	    System.out.print("\n" + "-------------------------------------" + "\n");
	}
	
	public static void debutPartie(Jeu jeu, Iterator<Joueur> iterateurJoueur){
		System.out.print("Début de la partie");
		
		while(iterateurJoueur.hasNext()) {
			Joueur joueur = iterateurJoueur.next();
			System.out.print(joueur.getNom() + " ");
			roll(jeu, listeDes.creerIterateur());
		}
	}
	
	public static void roll(Jeu jeu, Iterator<De> iterateurDe){
		while(iterateurDe.hasNext()) {
			int valeurDeAleatoire = (int) (Math.random() * jeu.getNbFacesDe() + 1);
			
			De deCourant = iterateurDe.next();
			deCourant.setValeur(valeurDeAleatoire);
			System.out.print(deCourant.getValeur() + " ");
			
			deCourant.compareTo(deCourant);
		}
	}
}
