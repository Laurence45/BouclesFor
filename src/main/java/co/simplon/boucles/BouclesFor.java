package co.simplon.boucles;

public class BouclesFor {
	public static final int MAX_SUPPORTED = 100;

	private Integer debut = null;
	private Integer fin = null;

	
	
	public BouclesFor() {
	}

	public BouclesFor(int debut, int fin) {
		this.debut = debut;
		this.fin = fin;
	}

	public int[] construireTableau() {
		int []tableau = new int [10];
		for (int i=0 ; i<tableau.length ; i++)
			tableau [i] = i+1 ;
		if (debut == null || fin == null) {
			return construireTableauSansBornes();
		} else {
			return tableau ; //pour que la construction se fasse
		}
	}

	public int[] construireTableauInverse() {
		int[]tableau = construireTableau();
		int[] position = new int[10];
		int j = 0;
		for (int i=9 ; i>=0 ; i--){
			position[i] = tableau[j]; 
			j++;
		}
		return position; // pour obtenir le tableau avec chiffre de 10 à 1
			
	}


	public int[] construireTableauEntiersPairs() {
		return null;
	}

	private int[] construireTableauAvecBornes() {
		tableau [0] = 1;
		fin = fin-debut;
		int []tableau = new int[fin];
		return tableau;
	}

	private int[] construireTableauSansBornes() {
		return null;
	}

	public String[] suffixerTableau(String[] tableauEntree, String suffixe) {
		return null;
	}

	public Integer[] applanirMatrice(Integer[][] matrice) {
		return null;
	}

	public int[] construireTableauAvecWhile() {
		return null;
	}
	
	public int[] construireTableauEntiersPairsAvecWhile() {
		return null;
	}

}
