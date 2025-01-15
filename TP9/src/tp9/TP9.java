/**
 * 
 */
package tp9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class TP9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kRead;
		Rectangle kSquare;
		
		kSquare = new Rectangle();
		kRead = new Scanner(System.in);
		try {
			System.out.printf("Entrez la largeur du rectangle : ");
			kSquare.setWidth(kRead.nextFloat());
			kRead.nextLine(); //consommation de la touche enter
			System.out.printf("Entrez la hauteur du rectangle : ");
			kSquare.setWidth(kRead.nextFloat());
			kRead.nextLine(); //consommation de la touche enter
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

}
