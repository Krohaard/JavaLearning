/**
 * 
 */
package tp008;

import java.util.Scanner;

import krohaard.KFunc;

/**
 * 
 */
public class TP008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionFormes kForme;
		Cercle Circle;
		Rectangle Rectangular;
		Triangle Triangular;
		Scanner kInput;
		String kChoice;
		int kNewForme;
		double kNumber1;
		double kNumber2;
		double kNumber3;
		kInput = new Scanner(System.in);
		kForme = new GestionFormes();
		Circle = new Cercle( (double) KFunc.kQuestion(kInput, "Entrez le rayon du cercle en mm : ", "double") );
		kForme.AddForm(Circle);
		kNumber1 = (double) KFunc.kQuestion(kInput, "Entrez la longueur du rectangle en mm : ", "double");
		kNumber2 = (double) KFunc.kQuestion(kInput, "Entrez la largeur du rectangle en mm : ", "double");
		Rectangular = new Rectangle(kNumber1,kNumber2);
		kForme.AddForm(Rectangular);
		kNumber1 = (double) KFunc.kQuestion(kInput, "Entrez la longueur du premier côté en mm : ", "double");
		kNumber2 = (double) KFunc.kQuestion(kInput, "Entrez la longueur du second côté en mm : ", "double");
		kNumber3 = (double) KFunc.kQuestion(kInput, "Entrez la longueur du troisième côté en mm : ", "double");
		Triangular = new Triangle(kNumber1,kNumber2,kNumber3);
		kForme.AddForm(Triangular);
		kForme.DrawForm();
		kInput.close();
	}
}
