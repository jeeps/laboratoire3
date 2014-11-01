package appli;

public class Joueur implements Comparable<Joueur>{
	private String nom;
	private int score = 0;
	
	public Joueur(String nomJoueur){
		this.nom = nomJoueur;
		this.score = 0;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	
	public int getScore(){
		return score;
	}

	/**
	 * Compare le score du joueur
	 * @return 
	 */
	@Override
	public int compareTo(Joueur other) {
		return Integer.compare(this.score, other.score);
	}
}