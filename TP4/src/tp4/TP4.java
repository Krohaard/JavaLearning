/**
 * 
 */
package tp4;

import java.util.Scanner;

/**
 * 
 */
public class TP4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kValue;
		Scanner kRead = new Scanner(System.in);
		System.out.println("Bonjour!! Écris moi quelque chose");
		kValue = kRead.nextLine();
		kRead.close();
		if( kValue.length() > 0 ) {
			System.out.println("Majuscules : " + kValue.toUpperCase());
			System.out.println("Minuscules : " + kValue.toLowerCase());
			System.out.println("Nombres de caractères : " + kCountChar(kValue));
			System.out.println("Nombres de mots : " + (kValue.split(" ")).length);
		}else {
			System.out.println("Entrée vide");
		}
	}
	public static int kCountChar(String kLine) {
		int kk;
		int kCount=0;
		for(kk=0;kk<kLine.length();kk++) {
			if((kLine.charAt(kk)>='a' && kLine.charAt(kk)<='z') || ((kLine.charAt(kk)>='A' && kLine.charAt(kk)<='Z'))) kCount++;
		}
		return kCount;
	}
}
