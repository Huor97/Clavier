// classe fournissant des fonctions de lecture au clavier
import java.io.*;
import java.util.Scanner;


@SuppressWarnings("unused")

public class Clavier{
	
	
	
	// la methode lireInt qui returne integer 
//	public static int lireInt() {
//try ( Scanner scanner = new Scanner( System.in ) ) {
//            
//            System.out.print( "Veuillez saisir un premier entier : " );
//            int a = scanner.nextInt();
//            
//            System.out.print( "Veuillez saisir un second entier : " );
//            int b = scanner.nextInt();
//            
//        
//            
//        }
//        
//		return 0;	
//		
//	}
	

	
	
	
	// le methode lireString qui returne String
	public static String lireString() {
		return null;      // lecture d'une chaine
		
		}
	

	//la methode lirefloat qui returne float 
	public static float lireFloat(){
		return 0;     // lecture d'un float

		}
		
	
	
	//la methode lireDouble qui returne double
	public static double lireDouble() {
		return 0;    // lecture d'un double

	}

    public static int lireInt() throws NumberFormatException {
    	System.out.println("rentre une numbre");
    
    	return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    
    
	//programme de test de la classe Clavier
	public static void main(String[] args){
		int result ;
		result = Clavier.lireInt() ;
//        int result = a + b;
        System.out.println( result );
	}
}

