// classe fournissant des fonctions de lecture au clavier
import java.io.*;

// class Clavier recuper les donne qu'on donne après Clavier
public class Clavier{
	
	// Lire moi les chenes de caracter 
	public static String lireString() {
		// crée moi une variable de type String
		String saisie = null;
		/* Crée objet de type BufferedReader et
		mettre de dans une objet de type inputStreameader qui prendre input*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		try {
			// mettre dans saisie br 
			saisie = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//returne moi saisie
		return saisie;
	}
	
	// Lire moi des entiers
	public static int lireInt() {
		// faire reference de la methode lireString()
		String saisie1 = lireString();
		// Crée moi une variable de type int qui fait reference la ligne 28
		int myInt = Integer.parseInt(saisie1);
		return myInt;
	}

}

