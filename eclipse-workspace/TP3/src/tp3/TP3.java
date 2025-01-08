/**
 * 
 */
package tp3;

import java.util.Scanner;

/**
 * 
 */
public class TP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kk;
		int kTotalNumber;
		kTotalNumber=kQuestion("Combien de nombres souhaitez-vous saisir ?");
		for(kk=0;kk<kTotalNumber;kk++) {
			
		}

	}
	public static float kQuestion(String kMyQuestion) {
		float kValue;
		Scanner kRead = new Scanner(System.in);
		System.out.printf(kMyQuestion);
		kValue=kRead.nextFloat();
		kRead.close();
		return kValue;
	}
	public static float kSumArray(float kData[]) {
		return 0;
	}

}
