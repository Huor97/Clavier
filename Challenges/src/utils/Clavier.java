package utils;
// classe fournissant des fonctions de lecture au clavier
import java.io.*; // recuper tout éritage de class java
// class Clavier recuper les donnés qu'on donne après Clavier
public class Clavier{
	// Lire moi chaînes de caractère 
	public static String lireString() {
		// crée moi une variable de type String
		String saisie = null;
		/**
		 * Crée objet de type BufferedReader et
		 * mettre de dans un objet 
		 * de type inputStreameader (input) 
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		try {
			// méthode readLine (lire moi la lign) 
			saisie = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return saisie;
	}
	// Lire moi entier
	public static int lireInt() {
		// faire reference de la methode lireString()
		String saisie1 = lireString();
		// Crée une variable type int qui fait reference saisie1 parseInt (lire un après l'autre)
		int myInt = Integer.parseInt(saisie1);
		return myInt;
	}
	// Lire float 
	public static float lireFloat() {
		// faire reference de la methode lireString()
		String saisie2 = lireString();
		// Crée variable de type float. parseFloat (lire un après l'autre)
		float myFloat = Float.parseFloat(saisie2);
		return myFloat;
	}
	// Lire float 
	public static double lireDouble() {
	// faire reference de la methode lireString()
		String saisie3 = lireString();
	// Crée variable de type float. parseFloat (lire un après l'autre)
		double myDouble = Double.parseDouble(saisie3);
		return myDouble;
	}
	//main de projet pour exécuter les objets
	public static void main(String[] args) {
	}
}

