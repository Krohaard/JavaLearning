/**
 * 
 */
package tp9;

import java.util.Scanner;

import tp9.Rectangle;

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
		System.out.printf("Entrez la largeur du rectangle : ");
		kSquare.setkLenght(kRead.nextFloat());
		kRead.nextLine(); //consommation de la touche enter
		System.out.printf("Entrez la hauteur du rectangle : ");
		kSquare.setkWeight(kRead.nextFloat());
		kRead.nextLine(); //consommation de la touche enter
		System.out.printf("Aire : %.2f\n", kSquare.kSurfaceRectangle());
		System.out.printf("Périmètre : %.2f\n", kSquare.kPerimetreRectangle());
	}

}
