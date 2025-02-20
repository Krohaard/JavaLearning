/**
 * 
 */
package tp004;

/**
 * 
 */
public class TP004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kNumber;
		kNumber = (int) (Math.random()*153765+3)/2;
		if (kNumber % 2 !=0) {
			System.out.printf("Le nombre %d est impair",kNumber);
		} else {
			System.out.printf("Le nombre %d est pair",kNumber);
		}
	}

}
