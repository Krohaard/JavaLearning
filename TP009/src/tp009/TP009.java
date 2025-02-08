/**
 * 
 */
package tp009;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class TP009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kRead;
		Rectangle kSquare;
		
		kSquare = new Rectangle();
		kRead = new Scanner(System.in);
		try {
			kSquare.setWidth(kScannerInput(kRead,"Entrez la largeur du rectangle : "));
//			kRead.nextLine(); //consommation de la touche enter
			kSquare.setLenght(kScannerInput(kRead,"Entrez la hauteur du rectangle : "));
//			kRead.nextLine(); //consommation de la touche enter
			kSquare.checkDimension();
			System.out.printf("Aire : %.2f\n", kSquare.calculateArea());
			System.out.printf("Périmètre : %.2f\n", kSquare.calculatePerimeter());
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Erreur : Entrée invalide.");
		} finally {
			kRead.close();
		}
		
	}
	public static float kScannerInput(Scanner kLine, String kText) {
		System.out.printf(kText);
		return kLine.nextFloat();
	}

}
