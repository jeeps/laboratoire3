package laboratoire3;

public class ApplicationDes {
	private static int toursCourant = 0;
	private static int joueurCourant;
	private static int deCourant;
	private static JeuBunco jeu = new JeuBunco();
	
	public static void main(String[] args) {
		System.out.print("Début du jeu"+"\n");
		System.out.print("-------------------------------------"+"\n");
		
		//ActionJeu actions = new ActionJeu();
		Jeu jeu = new Jeu();
		jeu.setStrategie(new StrategieTest());
		jeu.test();
	}
	

}
