/**
 * 
 */
package tp1;

import java.util.Scanner;


/**
 * 
 */
public class TP1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		float kSalaire;
		int kAge;
		String kName;

		Scanner kRead = new Scanner(System.in);
		// Demande et lecture du nom
		System.out.printf("Entrez votre nom : ");
		kName = kRead.nextLine(); // Permet de lire une ligne complète
		
		// Demande et lecture de l'âge
		System.out.printf("Entrez votre âge : ");
		kAge = kRead.nextInt();
		
		// Demande et lecture du salaire
		System.out.printf("Entrez votre salaire : ");
		kSalaire = kRead.nextFloat();
		
		// Affichage formaté
		System.out.printf("Bonjour %s, vous avez %d ans et vous gagnez %.2f €.\n", kName, kAge, kSalaire);
		
		// Fermeture du scanner
		kRead.close();

	}

}
