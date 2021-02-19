package sem2;

import utils.Clavier;

public class S2Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Donnée un numbre => \n");
		
		int enfent = 3;
		int adulte = 60;
		int agée = 61;
		
		int PrisBillet; 
	    String res;
	    PrisBillet = Clavier.lireInt();
	    switch ((PrisBillet)) {
	      case 0 :
	        res = "gratuit";
	        break;
	      case 1 :
	        res = "5 euros";
	        break;
	 
	      case 6 :
	        res = "8 euros";
	        break;
	      default :
	        res = "4 euros";
	        break;
	    }
	    System.out.print("c'est un "+res);
	  }
	
}
