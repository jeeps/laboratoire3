package laboratoire3;

public class Jeu{
	private IStrategie strategie;
	
	public Jeu() {
		//Stratégie par défaut
		strategie = new JeuBunco();
	}
	
	public void setStrategie(IStrategie nouvelleStrategie) {
		strategie = nouvelleStrategie;
	}
	
	public void test() {
		strategie.test(this);
	}
}
