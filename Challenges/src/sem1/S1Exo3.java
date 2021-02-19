package sem1;

import utils.Clavier;

//import utils.Clavier;

public class S1Exo3 {

	public static void main(String[] args) {
		
		 int[][] MA = {{2,3},{2,1}};
		 int[][] MB= {{4,2},{3,1}};
		 int[][]MC = null;
	
	     try {
	    	 
	    	 afficher(MA);
			 afficher(MB);
			 MC = multiplier(MA, MB);
	    	 System.out.println();
			afficher(MC);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static int[][] multiplier(int[][] mA, int[][] mB) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void afficher(int[][] mA) {
		// TODO Auto-generated method stub
		
	}
}
