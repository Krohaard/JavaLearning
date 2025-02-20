/**
 * 
 */
package tp005;

import java.util.Scanner;

/**
 * 
 */
public class TP005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kPeople1;
		Person kPeople2;
		String kName;
		int kAge;
		Scanner kRead;
		kRead = new Scanner(System.in);
		System.out.printf("Quel est le nom de la première personne: ");
		kName = kRead.nextLine();
		System.out.printf("Quel est l'age de la première personne: ");
		kAge = kRead.nextInt();kRead.nextLine();
		kPeople1 = new Person(kName,kAge);
		System.out.printf("Quel est le nom de la seconde personne: ");
		kName = kRead.nextLine();
		System.out.printf("Quel est l'age de la seconde personne: ");
		kAge = kRead.nextInt();kRead.nextLine();
		kPeople2 = new Person(kName,kAge);
		kPeople1.displayDetails();
		kPeople2.displayDetails();
		kRead.close();
	}
}