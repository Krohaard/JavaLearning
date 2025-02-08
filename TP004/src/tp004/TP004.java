/**
 * 
 */
package tp004;

import java.util.Scanner;

/**
 * 
 */
public class TP004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String kValue;
		Scanner kRead = new Scanner(System.in);
		System.out.println("Bonjour!! Écris moi quelque chose :");
		kValue = kRead.nextLine();
		kRead.close();
		if( kValue.length() > 0 ) {
			System.out.println("Majuscules : " + kValue.toUpperCase());
			System.out.println("Minuscules : " + kValue.toLowerCase());
			System.out.println("Nombres de caractères : " + kCountChar(kValue));
			System.out.println("Nombres de mots : " + kCountWords(kValue));
		}else {
			System.out.println("Entrée vide");
		}
	}
	public static int kCountChar(String kLine) {
		int kk;
		int kCount=0;
		for(kk=0;kk<kLine.length();kk++) {
			if(Character.isLetter(kLine.charAt(kk))) kCount++;
		}
		return kCount;
	}
    public static int kCountWords(String kLine) {
    	String[] kWords;
		// Suppression des espaces multiples
		kWords = kLine.trim().split("\\s+");
		return kWords.length;
    }
}
