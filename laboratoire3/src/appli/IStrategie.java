package appli;

public interface IStrategie {
	public void preparerValeurParDefaut(Jeu jeu);
	public void calculerScoreTour(Jeu jeu);
	public void calculerLeVainceur(Jeu jeu);
}
