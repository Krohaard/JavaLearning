/**
 * 
 */
package tp012;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class TP012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kChoice;

		Library OneLibrary;
		Scanner kRead;

		OneLibrary = new Library();
		kRead = new Scanner(System.in);
		try {
			do {
				kChoice = kDisplayMenu(kRead);
				switch(kChoice) {
					case 1: //adding a book in library
						System.out.printf("Choix : %d\n",kChoice);
/*						kLibrary.add(OneLibrary);
						kLibrary.get(kLibrary.size()-1).AddBook(kRead);*/
						OneLibrary.AddBook(kRead);
						break;
					case 2: //Search a book by title
						System.out.printf("Choix : %d\n",kChoice);
						OneLibrary.SearchBook(kRead);
						break;
					case 3: //Show the books available in the library
						System.out.printf("Choix : %d\n",kChoice);
						OneLibrary.DisplayBookAvailable();
						break;
					case 4: //Borrow a book
						System.out.printf("Choix : %d\n",kChoice);
						OneLibrary.BorrowBook(kRead);
						break;
					case 5: //Return a book
						System.out.printf("Choix : %d\n",kChoice);
						OneLibrary.ReturnBook(kRead);
						break;
					case 6: //Quit
						System.out.printf("Choix : %d\n",kChoice);
						break;
					default:
						System.out.println("Veuillez taper un nombre entre 1 et 6");
						break;
				}
			}while(kChoice != 6);
		} catch (InputMismatchException e) {
			System.out.println("Erreur : Entrée invalide.");
		} finally {
			kRead.close();
		}
	}
	private static int kDisplayMenu(Scanner kChoice) {
		int choice;
		System.out.println("");
		System.out.println("--- MENU ---");
		System.out.println("1. Ajouter un livre");
		System.out.println("2. Rechercher un livre par titre");
		System.out.println("3. Afficher les livres disponibles");
		System.out.println("4. Emprunter un livre");
		System.out.println("5. Retourner un livre");
		System.out.println("6. Quitter");
		choice = kChoice.nextInt();
		kChoice.nextLine();
		return choice;
	}
}
