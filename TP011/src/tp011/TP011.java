/**
 * 
 */
package tp011;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * 
 */
public class TP011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float kNote;
		String kName;
		Scanner kRead;
		Students kNotes;
		
		kNotes = new Students();

		kRead = new Scanner(System.in);
		try {
			do {
				System.out.printf("Entrez le nom de l'étudiant : ");
				kName = kRead.nextLine().trim();
				if(kName.compareToIgnoreCase("fin")!=0) {
					System.out.printf("Entrez la note de " + kName + " : ");
					kNote = kRead.nextFloat();
					kRead.nextLine();
					kNotes.AddNote(kName, kNote);
				}
			} while(kName.compareToIgnoreCase("fin")!=0);
			System.out.printf("Moyenne de la classe : %.2f\n",kNotes.GetAverage());
			System.out.printf("Note Maximale : %s\n",kNotes.FirstStudent());
			System.out.printf("Note Minimale : %s\n",kNotes.LastStudent());
			System.out.println("Étudiants ayant une note supérieure ou égale à la moyenne :");

			for(Entry<String, Float> kElement : kNotes.ListingStudentAboveAverage().entrySet()) {
				System.out.println(" - " + kElement.getKey() + " (" + kElement.getValue() + ")");
			}
		} catch (InputMismatchException e) {
			System.out.println("Erreur : Entrée invalide. Veuillez entrer un nombre.");
		} finally {
			kRead.close();
		}
	}
}
