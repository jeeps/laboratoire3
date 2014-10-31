package laboratoire3;

public class De implements Comparable<De>{
	private int nbDes;
	private int nbFaces;
	
	public De(){
	}
	
	public void setNbDes(int nbDes){
		this.nbDes = nbDes;
	}
	
	public int getNbDes(){
		return nbDes;
	}

	@Override
	public int compareTo(De deCourant) {
		System.out.print("test compare");
		return 0;
	}
}
