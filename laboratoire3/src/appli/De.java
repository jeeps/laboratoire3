package appli;

public class De implements Comparable<De>{
	private int nbDes;
	private int nbFaces;
	private int valeurMin = 1;
	private int valeurMax = nbFaces;
	private int valeurObtenu = 0;
	
	public De(int nbFaces, int valeurObtenu){
		this.nbFaces = nbFaces;
		this.valeurObtenu = valeurObtenu;
	}

	@Override
	public int compareTo(De deCourant) {
		int test = 0;
		if (this.valeurObtenu == ((De) deCourant).valeurObtenu)
			test = 1;
        else if ((this.valeurObtenu) > ((De) deCourant).valeurObtenu)
        	test = 2;
        else
        	test = 3;
		
		//System.out.print("Compare valeur = " +test+ "-");
		return 0;
	}

	public void setValeur(int valeurDeCourant) {
		this.valeurObtenu = valeurDeCourant;
	}
	
	public int getValeur() {
		return valeurObtenu;
	}
}
