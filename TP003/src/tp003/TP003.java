/**
 * 
 */
package tp003;

import java.util.Scanner;

/**
 * 
 */
public class TP003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kk;
		int kTotalNumber;
		float[] kArrayInput;
		Scanner kRead = new Scanner(System.in);
		System.out.printf("Combien de nombres souhaitez-vous saisir ?");
		kTotalNumber=kRead.nextInt();
		if(kTotalNumber<=0) {
			System.out.printf("Impossible de traiter votre demande");
		}else {
			kArrayInput = new float[kTotalNumber];
			for(kk=0;kk<kTotalNumber;kk++) {
				System.out.printf("Entrez le nombre %d :", kk + 1);
				kArrayInput[kk]=kRead.nextFloat();
			}
			kRead.close();
			System.out.printf("Somme : %.2f\n", kSumArray(kArrayInput));
			System.out.printf("Moyenne : %.2f\n", kMeanArray(kArrayInput));
			System.out.printf("Plus grand nombre : %.2f\n", kMaxArray(kArrayInput));
			System.out.printf("Plus petit nombre : %.2f\n", kMinArray(kArrayInput));
		}
	}
	public static float kSumArray(float kData[]) {
		int kk;
		float kSum = 0;
		for(kk=0;kk<kData.length;kk++) {
			kSum = kSum + kData[kk];
		}
		return kSum;
	}
	public static float kMeanArray(float kData[]) {
		float kSum;
		kSum = kSumArray(kData);
		return kSum / kData.length;
	}
	public static float kMinArray(float[] kData) {
		int kk;
		float kMin=kData[0];
		for(kk=0;kk<kData.length;kk++) {
			if( kData[kk] < kMin ) kMin = kData[kk];
		}
		return kMin;
	}
	public static float kMaxArray(float[] kData) {
		int kk;
		float kMax=kData[0];
		for(kk=0;kk<kData.length;kk++) {
			if( kData[kk] > kMax ) kMax = kData[kk];
		}
		return kMax;
	}
}
