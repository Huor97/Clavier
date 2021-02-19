package sem2;

import java.util.Scanner;

public class S2Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("veullez saisir votre age?");
		int age = input.nextInt();
		System.out.println("habitez vous a Montreuil (O/N) ?");
		Scanner input2 = new Scanner(System.in);
		String saisieVille = input2.nextLine().toUpperCase();
		String message = "";
		// Age -3 = gratuite 
		// Montreuil + -60 = 5
		// ne pas Montreuil + -60 = 8
		// plus de 60 = 4
		if (age < 3) {
			message = "Billet gratuit";
		} else if (age < 60) {
			if (saisieVille.equals("O")) {
				message = "Billet 5 euros";
			}else {
				message = "Billet à 8 euros";
			}
				
		}else if (age > 60) {
			message = "Billet à 4 euros";
		}
		
		System.out.println(message);
		input.close();
		input2.close();
	  }
	
}
