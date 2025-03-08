/**
 * 
 */
package tp010_2;

import java.util.Scanner;

import krohaard.KFunc;

/**
 * 
 */
public class TP010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kNumber1;
		int kNumber2;
		int kResult;
		Scanner kInput;
		kInput = new Scanner(System.in);
		kNumber1 = (int) KFunc.kQuestion(kInput, "Entrez le premier nombre: ", "integer");
		kNumber2 = (int) KFunc.kQuestion(kInput, "Entrez le second nombre: ", "integer");
		try {
			kResult = kNumber1/kNumber2; // Cela lèvera une ArithmeticException
			System.out.println(kResult);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
//			System.out.println("Erreur : Division par zéro.");
		}
	}

}
