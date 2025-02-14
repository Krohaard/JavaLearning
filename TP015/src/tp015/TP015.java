/**
 * 
 */
package tp015;

import java.util.Scanner;

/**
 * 
 */
public class TP015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String lol;
		Scanner kTest;
		lol = new String();
		kTest = new Scanner(System.in);
		
		System.out.printf("test ligne vide :");
		if(kTest.hasNextLine()){
			System.out.println("coucou");
		} else if(kTest.hasNextInt()){
			System.out.println("auie");
		}
		lol = kTest.nextLine();
		System.out.printf("message : %s",lol);
		kTest.close();
	}

}
