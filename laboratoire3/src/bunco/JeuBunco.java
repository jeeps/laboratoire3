package bunco;

import appli.IStrategie;
import appli.Jeu;

public class JeuBunco implements IStrategie {
	private int nbToursBunco = 6;
	private int nbJoueurs = 2;
	private int nbDes = 3;
	private int nbFacesDe = 6;
	
	@Override
	public void preparerValeurParDefaut(Jeu jeu) {
		jeu.setNbTours(nbToursBunco);
		jeu.setNbJoueurs(nbJoueurs);
		jeu.setNbDes(nbDes);
		jeu.setNbFacesDe(nbFacesDe);
	}
	
	@Override
	public void calculerScoreTour(Jeu jeu) {
		
	}

	@Override
	public void calculerLeVainceur(Jeu jeu) {
		
	}

}
