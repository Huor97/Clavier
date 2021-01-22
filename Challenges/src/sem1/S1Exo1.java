package sem1;

import utils.Clavier;

public class S1Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print( "saisissez 4 chiffre en presant entrer à la fin de chaque chiffre \n " );
		int i = 0;
		double somme = 0;
		for (i=0; i<4; i++) {
			int x = Clavier.lireInt();
			somme+= x;
		}
//        int a = Clavier.lireInt();
//        
//        System.out.print( "Entier n°: 2\n " );
//        int b = Clavier.lireInt();
//        
//        System.out.print( "Entier n°: 3\n " );
//        int c = Clavier.lireInt();
//        
//        System.out.print( "Entier n°: 4\n " );
//        int d = Clavier.lireInt();
        
//        int saisie1 = a + b + c + d;
        System.out.printf( "la resulta est :"+ somme );
	}

}
