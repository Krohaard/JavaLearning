/**
 * 
 */
package tp011;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

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
				kQuestion("Entrez le nom de l'étudiant : ");
				kName = kRead.nextLine().trim();
				if(kName.compareToIgnoreCase("fin")!=0) {
					kQuestion("Entrez la note de " + kName + " : ");
					kNote = kRead.nextFloat();
					kRead.nextLine();
					kNotes.AddNote(kName, kNote);
				}
			} while(kName.compareToIgnoreCase("fin")!=0);
			System.out.printf("Moyenne de la classe : %.2f\n",kNotes.GetAverage());
			System.out.printf("La note la plus haute : %s\n",kNotes.FirstStudent());
			System.out.printf("La note la plus basse : %s\n",kNotes.LastStudent());
			kNotes.ListingStudentAboveAverage();
		} catch (Exception e) {
			
		} finally {
			kRead.close();
		}

	}
	private static void kQuestion(String kSentence) {
		System.out.printf(kSentence);
	}
}
