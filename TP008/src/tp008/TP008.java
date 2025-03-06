/**
 * 
 */
package tp008;

import java.util.ArrayList;
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
		ArrayList<GestionFormes> kForme;
		Cercle kCercle;
		Rectangle kRectangle;
		Triangle kTriangle;
		Scanner kInput;
		String kChoice;
		int kNewForme;
		
		kInput = new Scanner(System.in);
		kForme = new ArrayList<>();
		kChoice = "1: Cercle \n2: Triangle \n3: Rectangle\n";

		kNewForme = (int) KFunc.kQuestion(kInput, kChoice, "integer");
		switch(kNewForme) {
			case 1:
				kForme.add(null);
				break;
			case 2:
				break;
			case 3:
				break;
		}
		kInput.close();
	}

}
